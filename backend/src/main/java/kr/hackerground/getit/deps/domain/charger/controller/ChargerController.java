package kr.hackerground.getit.deps.domain.charger.controller;

import kr.hackerground.getit.deps.domain.charger.dto.ChargerDto;
import kr.hackerground.getit.deps.domain.charger.service.ChargerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/charger")
public class ChargerController {
    private final ChargerService chargerService;
    @PostMapping("/{carCenterId}")
    public ResponseEntity<HttpStatus> create(@PathVariable("carCenterId") Long carCenterId, @RequestBody ChargerDto.Request chargerDto){
        chargerService.create(carCenterId, chargerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{chargerId}")
    public ResponseEntity<ChargerDto.Response> readOne(@PathVariable("chargerId") Long chargerId){
        ChargerDto.Response charger = chargerService.read(chargerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //readAllAvailableCharger
    @GetMapping("/available")
    public ResponseEntity<List<ChargerDto.Response>> readAllAvailableCharger(){
        List<ChargerDto.Response> chargerList = chargerService.readAllAvailableCharger();
        return new ResponseEntity<>(chargerList, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ChargerDto.Response>> readAll(){
        List<ChargerDto.Response> chargerList = chargerService.readAll();
        return new ResponseEntity<>(chargerList, HttpStatus.OK);
    }
    @PutMapping("/{chargerId}")
    public ResponseEntity<HttpStatus> update(@PathVariable("chargerId") Long chargerId, @RequestBody ChargerDto.Request chargerDto){
        chargerService.update(chargerId, chargerDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{chargerId}")
    public ResponseEntity<?> delete(@PathVariable("chargerId") Long chargerId){
        chargerService.delete(chargerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
