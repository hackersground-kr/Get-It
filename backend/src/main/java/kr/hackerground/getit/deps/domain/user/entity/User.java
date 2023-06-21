package kr.hackerground.getit.deps.domain.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import kr.hackerground.getit.deps.domain.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor @AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String phoneNumber;

    public User(UserDto.Request userDto) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.phoneNumber = userDto.getPhoneNumber();
    }
    public void update(UserDto.Request userDto){
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.phoneNumber = userDto.getPhoneNumber();
    }
}
