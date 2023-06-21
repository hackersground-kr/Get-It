package kr.hackerground.getit.deps.domain.charger.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.charger.dto.ChargerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Builder
public class Charger {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Integer minimumTime;
    Long volume;
    CurrentType currentType;
    ChargerType chargerType;

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
