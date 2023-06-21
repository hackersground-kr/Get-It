package kr.hackerground.getit.deps.domain.reservation.repository;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.reservation.entity.Reservation;
import kr.hackerground.getit.deps.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Optional<Reservation> findByUserAndCarCenter(User user, CarCenter carCenter);
}
