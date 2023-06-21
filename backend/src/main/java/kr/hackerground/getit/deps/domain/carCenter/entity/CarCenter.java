package kr.hackerground.getit.deps.domain.carCenter.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.carCenter.dto.CarCenterDto;
import kr.hackerground.getit.deps.domain.charger.entity.Charger;
import kr.hackerground.getit.deps.domain.review.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Builder
public class CarCenter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    @OneToOne
    Address address;
    String number;
    LocalTime startTime;
    LocalTime endTime;
    Long price;
    @OneToMany(mappedBy = "carCenter", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Charger> chargers = new ArrayList<>();
    @OneToMany(mappedBy = "carCenter", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Review> reviews = new ArrayList<>();

    public void update(CarCenterDto.Request carCenterDto) {
        this.name = carCenterDto.getName();
        this.address.latitude = carCenterDto.getLatitude();
        this.address.longitude = carCenterDto.getLongitude();
        this.number = carCenterDto.getNumber();
        this.startTime = carCenterDto.getStartTime();
        this.endTime = carCenterDto.getEndTime();
        this.price = carCenterDto.getPrice();

    }
    //add charger
    public void addCharger(Charger charger) {
        charger.setCarCenter(this);
        charger.getCarCenter().getChargers().add(charger);
    }

    public void addReview(Review review) {
        review.setCarCenter(this);
        review.getCarCenter().getReviews().add(review);
    }
}
