package kr.hackerground.getit.deps.domain.user.entity;

import jakarta.persistence.*;
import kr.hackerground.getit.deps.domain.review.entity.Review;
import kr.hackerground.getit.deps.domain.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor @AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String phoneNumber;

    @Column(unique = true)
    String login;
    String password;

    String timeStamp;
    String imagePath;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Review> reviews = new ArrayList<>();

    public User(UserDto.Request userDto, String imagePath) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.phoneNumber = userDto.getPhoneNumber();
        this.login = userDto.getLogin();
        this.password = userDto.getPassword();
        this.timeStamp = userDto.getTimeStamp();
        this.imagePath = imagePath;
    }
    public void update(UserDto.Request userDto, String imagePath) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.phoneNumber = userDto.getPhoneNumber();
        this.timeStamp = userDto.getTimeStamp();
        this.imagePath = imagePath;
    }

    public void addReview(Review review) {
        review.setUser(this);
        review.getUser().getReviews().add(review);
    }
}
