package kr.hackerground.getit.deps.global.error.excetion;

import kr.hackerground.getit.deps.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class CUserNotFoundException extends RuntimeException{
    private final ErrorCode errorCode;

    public CUserNotFoundException(){
        super();
        errorCode = ErrorCode.USER_NOT_FOUND;
    }
}
