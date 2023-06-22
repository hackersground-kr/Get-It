package kr.hackerground.getit.deps.domain.payment.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.global.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Getter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Payment extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne @JoinColumn(name = "user_id")
    User user;
    Long amount;
    @Enumerated(EnumType.STRING)
    PaymentType paymentType;
    @ManyToOne @JoinColumn(name = "car_center_id")
    CarCenter carCenter;
    public Payment(User user, Long amount, PaymentType paymentType, CarCenter carCenter) {
        this.user = user;
        this.amount = amount;
        this.paymentType = paymentType;
        this.carCenter = carCenter;
    }

}
