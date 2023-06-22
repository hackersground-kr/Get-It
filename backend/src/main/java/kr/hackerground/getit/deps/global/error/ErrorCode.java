package kr.hackerground.getit.deps.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    BAD_REQUEST(-1002, "잘못된 접근입니다.", HttpStatus.BAD_REQUEST),

    // 6000 ~ : 권한, 인증 에러
    USER_NOT_FOUND(-6008, "회원을 조회할 수 없습니다.", HttpStatus.UNAUTHORIZED),
    CAR_CENTER_NOT_FOUND(-6008, "카센터를 조회할 수 없습니다.", HttpStatus.BAD_REQUEST),
    CHARGER_NOT_FOUND(-6008, "충전기를 조회할 수 없습니다.", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(-6010, "비밀번호가 틀렸습니다.", HttpStatus.BAD_REQUEST),

    //8000 ~ : 클라이언트 에러
    ILLEGAL_ARGUMENT_ERROR(-8000, "잘못된 파라미터입니다.", HttpStatus.BAD_REQUEST),

    // 9000 ~ : 서버 에러
    INTERNAL_SERVER_ERROR(-9999, "서버 에러입니다.", HttpStatus.INTERNAL_SERVER_ERROR),
    EMPTY(-11111, "없음", HttpStatus.OK);

    final int code;
    final String message;
    final HttpStatus statusCode;

    public static ErrorCode findByName(String name){
        return Arrays.stream(values())
                .filter(type -> type.name().equals(name))
                .findAny()
                .orElse(EMPTY);
    }
}