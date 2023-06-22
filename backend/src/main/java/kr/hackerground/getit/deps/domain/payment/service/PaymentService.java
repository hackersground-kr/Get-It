package kr.hackerground.getit.deps.domain.payment.service;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.carCenter.repository.CarCenterRepository;
import kr.hackerground.getit.deps.domain.payment.dto.PaymentDto;
import kr.hackerground.getit.deps.domain.payment.entity.Payment;
import kr.hackerground.getit.deps.domain.payment.repository.PaymentRepository;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import kr.hackerground.getit.deps.global.error.excetion.CUserNotFoundException;
import kr.hackerground.getit.deps.global.error.excetion.CCarCenterNotFoundException;

import java.util.List;
@Service @RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;
    private final CarCenterRepository carCenterRepository;

    public void makePayment(Long userId, Long carCenterId, PaymentDto.Request paymentDto) {
        User user = userRepository.findById(userId).orElseThrow(CUserNotFoundException::new);
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow(CCarCenterNotFoundException::new);

        Payment payment = paymentDto.toEntity(user, carCenter);
        paymentRepository.save(payment);
    }
    public List<PaymentDto.Response> getUsersPayments(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(CUserNotFoundException::new);
        return paymentRepository.findAllByUser(user).stream().map(PaymentDto.Response::new).toList();
    }
}
