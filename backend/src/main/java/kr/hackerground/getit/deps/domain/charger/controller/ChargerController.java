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
    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody ChargerDto.Request chargerDto){
        chargerService.create(chargerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{chargerId}")
    public ResponseEntity<HttpStatus> readOne(@PathVariable("chargerId") Long chargerId){
        chargerService.read(chargerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> readAll(){
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
