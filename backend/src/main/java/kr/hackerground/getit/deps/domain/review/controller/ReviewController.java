package kr.hackerground.getit.deps.domain.review.controller;

import kr.hackerground.getit.deps.domain.review.dto.ReviewDto;
import kr.hackerground.getit.deps.domain.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/review")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/{carCenterId}")
    public ResponseEntity<HttpStatus> create(@PathVariable("carCenterId") Long carCenterId, @RequestBody ReviewDto.Request reviewDto){
        reviewService.create(carCenterId, reviewDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<ReviewDto.Response> readOne(@PathVariable("reviewId") Long reviewId){
        ReviewDto.Response review = reviewService.read(reviewId);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> readAll(){
        List<ReviewDto.Response> reviewList = reviewService.readAll();
        return new ResponseEntity<>(reviewList, HttpStatus.OK);
    }
    @PutMapping("/{reviewId}")
    public ResponseEntity<HttpStatus> update(@PathVariable("reviewId") Long reviewId, @RequestBody ReviewDto.Request reviewDto){
        reviewService.update(reviewId, reviewDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{reviewId}")
    public ResponseEntity<?> delete(@PathVariable("reviewId") Long reviewId){
        reviewService.delete(reviewId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}