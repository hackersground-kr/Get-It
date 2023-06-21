package kr.hackerground.getit.deps.global.error.excetion;

import kr.hackerground.getit.deps.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class CIllegalArgumentException extends RuntimeException{
    private final ErrorCode errorCode;
    private final String message;

    public CIllegalArgumentException(String message){
        super();
        this.errorCode = ErrorCode.ILLEGAL_ARGUMENT_ERROR;
        this.message = message;
    }
}
