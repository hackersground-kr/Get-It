package kr.hackerground.getit.deps.domain.carCenter.controller;

import kr.hackerground.getit.deps.domain.carCenter.dto.CarCenterDto;
import kr.hackerground.getit.deps.domain.carCenter.service.CarCenterService;
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
    public ResponseEntity<HttpStatus> readOne(@PathVariable("carCenterId") Long carCenterId){
        carCenterService.read(carCenterId);
        return new ResponseEntity<>(HttpStatus.OK);
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
    @DeleteMapping("/{placeId}")
    public ResponseEntity<?> delete(@PathVariable("carCenterId") Long carCenterId){
        carCenterService.delete(carCenterId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
