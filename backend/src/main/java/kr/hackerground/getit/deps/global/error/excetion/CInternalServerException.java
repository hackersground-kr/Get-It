package kr.hackerground.getit.deps.global.error.excetion;

import kr.hackerground.getit.deps.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class CInternalServerException extends RuntimeException{
    private final ErrorCode errorCode;

    public CInternalServerException(){
        super();
        errorCode = ErrorCode.INTERNAL_SERVER_ERROR;
    }
}
