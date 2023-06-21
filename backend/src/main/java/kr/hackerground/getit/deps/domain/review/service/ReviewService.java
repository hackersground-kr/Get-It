package kr.hackerground.getit.deps.domain.review.service;

import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.carCenter.repository.CarCenterRepository;
import kr.hackerground.getit.deps.domain.review.dto.ReviewDto;
import kr.hackerground.getit.deps.domain.review.entity.Review;
import kr.hackerground.getit.deps.domain.review.repository.ReviewRepository;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.domain.user.repository.UserRepository;
import kr.hackerground.getit.deps.global.error.excetion.CUserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final CarCenterRepository carCenterRepository;
    private final UserRepository userRepository;

    public void create(Long carCenterId, Long userId, ReviewDto.Request reviewDto){
        CarCenter carCenter = carCenterRepository.findById(carCenterId).orElseThrow();
        User user = userRepository.findById(userId).orElseThrow();

        Review review = new Review(reviewDto);

        carCenter.addReview(review);
        user.addReview(review);

        userRepository.save(user);
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
    public void update(Long userId, Long reviewId, ReviewDto.Request reviewDto){
        User user = userRepository.findById(userId).orElseThrow(CUserNotFoundException::new);
        Review review = reviewRepository.findByIdAndUser(reviewId, user).orElseThrow(
                () -> new RuntimeException("리뷰를 작성한 사용자가 아닙니다.")
        );

        review.update(reviewDto);
        reviewRepository.save(review);
    }

    //delete
    public void delete(Long userId, Long reviewId){
        User user = userRepository.findById(userId).orElseThrow(CUserNotFoundException::new);
        Review review = reviewRepository.findByIdAndUser(reviewId, user).orElseThrow(
                () -> new RuntimeException("리뷰를 작성한 사용자가 아닙니다.")
        );

        reviewRepository.delete(review);
    }

}
