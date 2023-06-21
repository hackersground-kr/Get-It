package kr.hackerground.getit.deps.domain.carCenter.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kr.hackerground.getit.deps.domain.carCenter.entity.Address;
import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.charger.entity.ChargerType;
import lombok.*;

import java.time.LocalTime;
import java.util.List;
@Getter
@Setter
public class CarCenterDto {
    @Getter @Setter @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class Request{
        String name;
        Double latitude;
        Double longitude;
        String number;
        LocalTime startTime;
        LocalTime endTime;
        Long price;
        String content;

        public CarCenter toEntity(Address address) {
            return CarCenter.builder()
                    .address(address)
                    .name(name)
                    .number(number)
                    .startTime(startTime)
                    .endTime(endTime)
                    .price(price)
                    .content(content)
                    .build();
        }
    }
    @Getter
    public static class Response{
        Long id;
        String name;
        Double latitude;
        Double longitude;
        String number;
        LocalTime startTime;
        LocalTime endTime;
        Long price;
        @Enumerated(EnumType.STRING)
        List<ChargerType> chargerTypes;
        Integer chargerCount;
        Long starRateAverage;
        String content;
        public Response(CarCenter carCenter, List<ChargerType> chargerTypes, Long starRateAverage) {
            this.id = carCenter.getId();
            this.name = carCenter.getName();
            this.latitude = carCenter.getAddress().getLatitude();
            this.longitude = carCenter.getAddress().getLongitude();
            this.number = carCenter.getNumber();
            this.startTime = carCenter.getStartTime();
            this.endTime = carCenter.getEndTime();
            this.price = carCenter.getPrice();
            this.chargerTypes = chargerTypes;
            this.chargerCount = carCenter.getChargers().size();
            this.starRateAverage = starRateAverage;
            this.content = carCenter.getContent();
        }
    }
}
