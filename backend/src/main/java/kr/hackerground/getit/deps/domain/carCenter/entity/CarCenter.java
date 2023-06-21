package kr.hackerground.getit.deps.domain.carCenter.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.carCenter.dto.CarCenterDto;
import kr.hackerground.getit.deps.domain.charger.entity.Charger;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
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
    @OneToMany(mappedBy = "carCenter", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Charger> chargers;

    public void update(CarCenterDto.Request carCenterDto) {
        this.name = carCenterDto.getName();
        this.address.latitude = carCenterDto.getLatitude();
        this.address.longitude = carCenterDto.getLongitude();
        this.number = carCenterDto.getNumber();
        this.startTime = carCenterDto.getStartTime();
        this.endTime = carCenterDto.getEndTime();

    }
    //add charger
    public void addCharger(Charger charger) {
        this.chargers.add(charger);
    }
}
