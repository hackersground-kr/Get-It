package kr.hackerground.getit.deps.domain.review.service;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.carCenter.repository.CarCenterRepository;
import kr.hackerground.getit.deps.domain.review.dto.ReviewDto;
import kr.hackerground.getit.deps.domain.review.entity.Review;
import kr.hackerground.getit.deps.domain.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final CarCenterRepository carCenterRepository;

    public void create(Long carCenterId, ReviewDto.Request reviewDto){
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow();
        Review review = new Review(reviewDto);
        carCenter.addReview(review);
        reviewRepository.save(review);
        carCenterRepository.save(carCenter);
    }

    //readOne
    public ReviewDto.Response read(Long reviewId){
        return new ReviewDto.Response(reviewRepository.findById(reviewId).orElseThrow());
    }

    //readAll
    public List<ReviewDto.Response> readAll(){
        return reviewRepository.findAll().stream()
                .map(ReviewDto.Response::new)
                .toList();
    }

    //update
    public void update(Long carCenterId, ReviewDto.Request reviewDto){
        Review review = reviewRepository.findById(carCenterId).orElseThrow();
        review.update(reviewDto);
        reviewRepository.save(review);
    }

    //delete
    public void delete(Long placeId){
        reviewRepository.deleteById(placeId);
    }

}
