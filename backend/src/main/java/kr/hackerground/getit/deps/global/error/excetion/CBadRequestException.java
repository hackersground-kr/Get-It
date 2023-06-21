package kr.hackerground.getit.deps.global.error.excetion;

import kr.hackerground.getit.deps.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class CBadRequestException extends RuntimeException{
    private final ErrorCode errorCode;
    private final String message;

    public CBadRequestException(String message){
        super();
        this.errorCode = ErrorCode.BAD_REQUEST;
        this.message = message;
    }
}
