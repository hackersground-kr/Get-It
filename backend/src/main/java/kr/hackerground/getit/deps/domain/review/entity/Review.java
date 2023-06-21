package kr.hackerground.getit.deps.domain.review.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.carCenter.entity.CarCenter;
import kr.hackerground.getit.deps.domain.review.dto.ReviewDto;
import kr.hackerground.getit.deps.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime registrationDate;

    @UpdateTimestamp
    private LocalDateTime modificationDate;

    private Short starRate;

    private String content;

    private String title;

    @ManyToOne @Setter
    private User user;

    @ManyToOne @Setter
    private CarCenter carCenter;

    public Review(ReviewDto.Request reviewDto) {
        this.starRate = reviewDto.getStarRate();
        this.content = reviewDto.getContent();
        this.title = reviewDto.getTitle();
    }

    public void update(ReviewDto.Request reviewDto) {
        this.starRate = reviewDto.getStarRate();
        this.content = reviewDto.getContent();
        this.title = reviewDto.getTitle();
    }
}
