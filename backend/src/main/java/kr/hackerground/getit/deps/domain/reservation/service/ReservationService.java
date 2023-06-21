package kr.hackerground.getit.deps.domain.reservation.service;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.carCenter.repository.CarCenterRepository;
import kr.hackerground.getit.deps.domain.carCenter.service.CarCenterService;
import kr.hackerground.getit.deps.domain.charger.entity.CurrentType;
import kr.hackerground.getit.deps.domain.reservation.entity.Reservation;
import kr.hackerground.getit.deps.domain.reservation.repository.ReservationRepository;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.domain.user.repository.UserRepository;
import kr.hackerground.getit.deps.global.error.excetion.CBadRequestException;
import kr.hackerground.getit.deps.global.error.excetion.CCarCenterNotFoundException;
import kr.hackerground.getit.deps.global.error.excetion.CUserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final UserRepository userRepository;
    private final CarCenterRepository carCenterRepository;
    private final ReservationRepository reservationRepository;
    @Transactional
    public void makeReservation(Long userId, Long carCenterId){
        User user = userRepository.findById(userId).orElseThrow(CUserNotFoundException::new);
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow(CCarCenterNotFoundException::new);
        checkAvailableCharger(carCenter);
        if(reservationRepository.findByUserAndCarCenter(user, carCenter).isPresent())
            throw new CBadRequestException("이미 예약한 충전소입니다.");
        Reservation reservation = new Reservation(user, carCenter);
        reservationRepository.save(reservation);
    }
    public void checkAvailableCharger(CarCenter carCenter){
        if(! carCenter.getChargers().stream().anyMatch(charger -> charger.getCurrentType() == CurrentType.AVAILABLE))
            throw new RuntimeException();
    }
    @Transactional
    public void cancelReservation(Long userId, Long carCenterId){
        User user = userRepository.findById(userId).orElseThrow(CUserNotFoundException::new);
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow(CCarCenterNotFoundException::new);
        Reservation reservation = reservationRepository.findByUserAndCarCenter(user, carCenter).orElseThrow(
                () -> new RuntimeException("예약한 충전소가 아닙니다.")
        );
        reservationRepository.delete(reservation);
    }
}
