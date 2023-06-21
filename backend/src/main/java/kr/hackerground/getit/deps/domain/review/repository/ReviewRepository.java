package kr.hackerground.getit.deps.domain.review.repository;

import kr.hackerground.getit.deps.domain.review.entity.Review;
import kr.hackerground.getit.deps.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByIdAndUser(Long id, User user);
}
