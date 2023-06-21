package kr.hackerground.getit.deps.domain.reservation.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.global.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor @AllArgsConstructor
public class Reservation extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_reservation_to_user"), nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "car_center_id", foreignKey = @ForeignKey(name = "fk_reservation_to_car_center"), nullable = false)
    private CarCenter carCenter;
    @Enumerated(EnumType.STRING)
    RegistrationStatus registrationStatus;

    public Reservation(User user, CarCenter carCenter) {
        this.user = user;
        this.carCenter = carCenter;
        this.registrationStatus = RegistrationStatus.REGEISTERED;
    }
}
