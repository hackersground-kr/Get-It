package kr.hackerground.getit.deps.domain.charger.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.charger.dto.ChargerDto;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Builder
public class Charger {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Integer minimumTime;
    Long volume;
    @Setter
    CurrentType currentType;
    ChargerType chargerType;
    @ManyToOne
    CarCenter carCenter;

    public Charger(ChargerDto.Request chargerDto) {
        this.minimumTime = chargerDto.getMinimumTime();
        this.volume = chargerDto.getVolume();
        this.currentType = chargerDto.getCurrentType();
        this.chargerType = chargerDto.getChargerType();
    }

    public void update(ChargerDto.Request chargerDto) {
        this.minimumTime = chargerDto.getMinimumTime();
        this.volume = chargerDto.getVolume();
        this.currentType = chargerDto.getCurrentType();
        this.chargerType = chargerDto.getChargerType();
    }
}
