package kr.hackerground.getit.deps.domain.review.repository;

import kr.hackerground.getit.deps.domain.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
