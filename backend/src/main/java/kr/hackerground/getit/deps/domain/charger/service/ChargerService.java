package kr.hackerground.getit.deps.domain.charger.service;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.carCenter.repository.CarCenterRepository;
import kr.hackerground.getit.deps.domain.charger.dto.ChargerDto;
import kr.hackerground.getit.deps.domain.charger.entity.Charger;
import kr.hackerground.getit.deps.domain.charger.entity.CurrentType;
import kr.hackerground.getit.deps.domain.charger.repository.ChargerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service @RequiredArgsConstructor
@RequestMapping("/api")
public class ChargerService {
    private final ChargerRepository chargerRepository;
    private final CarCenterRepository carCenterRepository;
    public void create(Long carCenterId, ChargerDto.Request chargerDto){
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow();
        Charger charger = new Charger(chargerDto);
        charger.setCurrentType(CurrentType.AVAILABLE);
        carCenter.addCharger(charger);
        chargerRepository.save(charger);
        carCenterRepository.save(carCenter);
    }
    //readOne
    public ChargerDto.Response read(Long chargerId){
        return new ChargerDto.Response(chargerRepository.findById(chargerId).orElseThrow());
    }
    //readAllAvailableCharger
    public List<ChargerDto.Response> readAllAvailableCharger(){
        return chargerRepository.findAll().stream()
                .filter(charger -> charger.getCurrentType().equals(CurrentType.AVAILABLE))
                .map(ChargerDto.Response::new)
                .toList();
    }
    //readAll
    public List<ChargerDto.Response> readAll(){
        return chargerRepository.findAll().stream()
                .map(ChargerDto.Response::new)
                .toList();
    }
    //update
    public void update(Long carCenterId, ChargerDto.Request chargerDto){
        Charger charger = chargerRepository.findById(carCenterId).orElseThrow();
        charger.update(chargerDto);
        chargerRepository.save(charger);
    }
    //delete
    public void delete(Long placeId){
        chargerRepository.deleteById(placeId);
    }

}
