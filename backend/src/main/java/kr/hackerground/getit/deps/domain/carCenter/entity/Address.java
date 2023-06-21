package kr.hackerground.getit.deps.domain.carCenter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Double latitude;
    Double longitude;

    public Address(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
