package kr.hackerground.getit.deps.domain.user.dto;

import kr.hackerground.getit.deps.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

public class UserDto {
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class Request{
        String name;
        String email;
        String phoneNumber;
        String login;
        String password;

        String timeStamp;
        MultipartFile image;
    }
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class Response{
        String name;
        String email;
        String phoneNumber;

        String timeStamp;
        String imagePath;
        public Response(User user) {
            this.name = user.getName();
            this.email = user.getEmail();
            this.phoneNumber = user.getPhoneNumber();

            this.timeStamp = user.getTimeStamp();
            this.imagePath = user.getImagePath();
        }
    }
}
