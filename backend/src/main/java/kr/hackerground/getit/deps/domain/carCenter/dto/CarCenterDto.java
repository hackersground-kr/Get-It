package kr.hackerground.getit.deps.domain.carCenter.dto;

import kr.hackerground.getit.deps.domain.carCenter.entity.Address;
import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import lombok.*;

import java.time.LocalTime;
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

        public CarCenter toEntity(Address address) {
            return CarCenter.builder()
                    .address(address)
                    .name(name)
                    .number(number)
                    .startTime(startTime)
                    .endTime(endTime)
                    .build();
        }
    }
    public static class Response{
        String name;
        Double latitude;
        Double longitude;
        String number;
        LocalTime startTime;
        LocalTime endTime;
        public Response(CarCenter carCenter) {
            this.name = carCenter.getName();
            this.latitude = carCenter.getAddress().getLatitude();
            this.longitude = carCenter.getAddress().getLongitude();
            this.number = carCenter.getNumber();
            this.startTime = carCenter.getStartTime();
            this.endTime = carCenter.getEndTime();
        }
    }
}
