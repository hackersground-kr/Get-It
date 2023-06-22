package kr.hackerground.getit.deps.domain.carCenter.service;

import kr.hackerground.getit.deps.domain.carCenter.dto.CarCenterDto;
import kr.hackerground.getit.deps.domain.carCenter.entity.Address;
import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.carCenter.repository.CarCenterRepository;
import kr.hackerground.getit.deps.domain.charger.dto.ChargerDto;
import kr.hackerground.getit.deps.domain.charger.entity.Charger;
import kr.hackerground.getit.deps.domain.charger.entity.ChargerType;
import kr.hackerground.getit.deps.domain.charger.entity.CurrentType;
import kr.hackerground.getit.deps.domain.review.dto.ReviewDto;
import kr.hackerground.getit.deps.domain.review.entity.Review;
import kr.hackerground.getit.deps.global.common.imageStore.Image;
import kr.hackerground.getit.deps.global.common.imageStore.ImageUploader;
import kr.hackerground.getit.deps.global.error.excetion.CCarCenterNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service @RequiredArgsConstructor
public class CarCenterService {
    private final CarCenterRepository carCenterRepository;
    private final ImageUploader imageUploader;
    public void create(CarCenterDto.Request carCenterDto) throws Exception {
        Address address = new Address(carCenterDto.getLatitude(), carCenterDto.getLongitude());
        Image image = imageUploader.upload(carCenterDto.getImage(), "carCenter");
        CarCenter carCenter = carCenterDto.toEntity(address, image.getImagePath());
        carCenterRepository.save(carCenter);
    }
    //readOne
    public CarCenterDto.Response read(Long carCenterId){
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow(CCarCenterNotFoundException::new);
        List<ReviewDto.Response> reviews = carCenter.getReviews().stream().map(ReviewDto.Response::new).toList();
        return new CarCenterDto.Response(carCenter, getChargerTypes(carCenter), getStarRateAverage(carCenter), reviews);
    }
    //readAllChargers
    public List<ChargerDto.Response> readAllChargers(Long carCenterId){
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow(CCarCenterNotFoundException::new);
        return carCenter.getChargers().stream().map(ChargerDto.Response::new).toList();
    }
    public List<ReviewDto.Response> readAllReview(Long carCenterId){
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow(CCarCenterNotFoundException::new);
        return carCenter.getReviews().stream().map(ReviewDto.Response::new).toList();
    }
    //readAll
    public List<CarCenterDto.Response> readAll(){
        return carCenterRepository.findAll().stream()
                .map(carCenter -> {
                    List<ChargerType> chargerTypes = getChargerTypes(carCenter);
                    Long starRateAverage = getStarRateAverage(carCenter);
                    List<ReviewDto.Response> reviews = carCenter.getReviews().stream().map(ReviewDto.Response::new).toList();
                    return new CarCenterDto.Response(carCenter, chargerTypes, starRateAverage, reviews);
                })
                .toList();
    }
    public List<ChargerType> getChargerTypes(CarCenter carCenter){
        return carCenter.getChargers().stream()
                .map(Charger::getChargerType)
                .toList();
    }
    public Long getStarRateAverage(CarCenter carCenter){
        List<Long> starRates = carCenter.getReviews().stream()
                .map(review -> {
                    return (long)review.getStarRate();
                }).toList();

        //starRates의 average

        if (starRates.size() == 0)
            return 0L;

        return starRates.stream().mapToLong(Long::longValue).sum() / starRates.size();

    }
    //update
    public void update(Long carCenterId, CarCenterDto.Request carCenterDto) throws Exception {
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow(CCarCenterNotFoundException::new);
        Image image = imageUploader.upload(carCenterDto.getImage(), "carCenter");
        carCenter.update(carCenterDto, image.getImagePath());
        carCenterRepository.save(carCenter);
    }
    //delete
    public void delete(Long placeId){
        carCenterRepository.deleteById(placeId);
    }
}
