package kr.hackerground.getit.deps.domain.carCenter.controller;

import kr.hackerground.getit.deps.domain.carCenter.dto.CarCenterDto;
import kr.hackerground.getit.deps.domain.carCenter.service.CarCenterService;
import kr.hackerground.getit.deps.domain.charger.dto.ChargerDto;
import kr.hackerground.getit.deps.domain.review.dto.ReviewDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/carCenter")
public class CarCenterController {
    private final CarCenterService carCenterService;
    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody CarCenterDto.Request carCenterDto){
        carCenterService.create(carCenterDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{carCenterId}")
    public ResponseEntity<CarCenterDto.Response> readOne(@PathVariable("carCenterId") Long carCenterId){
        CarCenterDto.Response carCenter = carCenterService.read(carCenterId);
        return new ResponseEntity<>(carCenter, HttpStatus.OK);
    }
    @GetMapping("/{carCenterId}/chargers")
    public ResponseEntity<List<ChargerDto.Response>> readAllCharger(@PathVariable("carCenterId") Long carCenterId){
        List<ChargerDto.Response> chargerList = carCenterService.readAllChargers(carCenterId);
        return new ResponseEntity<>(chargerList, HttpStatus.OK);
    }
    @GetMapping("/{carCenterId}/reviews")
    public ResponseEntity<List<ReviewDto.Response>> readAllReview(@PathVariable("carCenterId") Long carCenterId){
        List<ReviewDto.Response> reviewList = carCenterService.readAllReview(carCenterId);
        return new ResponseEntity<>(reviewList, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> readAll(){
        List<CarCenterDto.Response> carCenterList = carCenterService.readAll();
        return new ResponseEntity<>(carCenterList, HttpStatus.OK);
    }
    @PutMapping("/{carCenterId}")
    public ResponseEntity<HttpStatus> update(@PathVariable("carCenterId") Long carCenterId, @RequestBody CarCenterDto.Request carCenterDto){
        carCenterService.update(carCenterId, carCenterDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{carCenterId}")
    public ResponseEntity<?> delete(@PathVariable("carCenterId") Long carCenterId){
        carCenterService.delete(carCenterId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
