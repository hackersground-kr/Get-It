package kr.hackerground.getit.deps.domain.user.dto;

import kr.hackerground.getit.deps.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class UserDto {
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class Request{
        String name;
        String email;
        String phoneNumber;
    }
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class Response{
        String name;
        String email;
        String phoneNumber;
        public Response(User user) {
            this.name = user.getName();
            this.email = user.getEmail();
            this.phoneNumber = user.getPhoneNumber();
        }
    }
}
