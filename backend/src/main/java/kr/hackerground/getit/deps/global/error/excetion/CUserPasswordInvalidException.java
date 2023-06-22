package kr.hackerground.getit.deps.global.error.excetion;

import kr.hackerground.getit.deps.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class CUserPasswordInvalidException extends RuntimeException{
    private final ErrorCode errorCode;
    private final String message;

    public CUserPasswordInvalidException(String message){
        super();
        this.errorCode = ErrorCode.PASSWORD_INVALID;
        this.message = message;
    }
}
