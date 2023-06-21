package kr.hackerground.getit.deps.domain.charger.dto;

import kr.hackerground.getit.deps.domain.charger.entity.Charger;
import kr.hackerground.getit.deps.domain.charger.entity.ChargerType;
import kr.hackerground.getit.deps.domain.charger.entity.CurrentType;
import lombok.*;

import java.time.LocalTime;
@Getter
@Setter
public class ChargerDto {
    @Getter @Setter @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class Request{
        Integer minimumTime;
        Long volume;
        CurrentType currentType;
        ChargerType chargerType;
    }
    @Getter
    public static class Response{
        Integer minimumTime;
        Long volume;
        CurrentType currentType;
        ChargerType chargerType;
        public Response(Charger charger) {
            this.minimumTime = charger.getMinimumTime();
            this.volume = charger.getVolume();
            this.currentType = charger.getCurrentType();
            this.chargerType = charger.getChargerType();
        }
    }
}
