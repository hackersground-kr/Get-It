package kr.hackerground.getit.deps.domain.payment.dto;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.payment.entity.Payment;
import kr.hackerground.getit.deps.domain.payment.entity.PaymentType;
import kr.hackerground.getit.deps.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

public class PaymentDto {
    @Data @AllArgsConstructor
    public static class Request{
        PaymentType paymentType;
        Long amount;
        public Payment toEntity(User user, CarCenter carCenter) {
            return Payment.builder()
                    .user(user)
                    .carCenter(carCenter)
                    .paymentType(paymentType)
                    .amount(amount)
                    .build();
        }
    }
    @Getter
    public static class Response{
        Long id;
        String carCenterName;
        LocalDateTime paymentTime;
        PaymentType paymentType;
        Long amount;
        public Response(Payment payment) {
            this.id = payment.getId();
            this.carCenterName = payment.getCarCenter().getName();
            this.paymentTime = payment.getCreatedTime();
            this.paymentType = payment.getPaymentType();
            this.amount = payment.getAmount();
        }
    }
}
