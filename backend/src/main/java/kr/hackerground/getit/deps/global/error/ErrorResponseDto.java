package kr.hackerground.getit.deps.global.error;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ErrorResponseDto {
    int status;
    int code;
    String name;
    String message;

    public ErrorResponseDto(ErrorCode errorCode){
        this.status = errorCode.getStatusCode().value();
        this.code = errorCode.getCode();
        this.name = errorCode.name();
        this.message = errorCode.getMessage();
    }

    public ErrorResponseDto(ErrorCode errorCode, String message){
        this.status = errorCode.getStatusCode().value();
        this.code = errorCode.getCode();
        this.name = errorCode.name();
        this.message = errorCode.getMessage() + " " + message;
    }


}
