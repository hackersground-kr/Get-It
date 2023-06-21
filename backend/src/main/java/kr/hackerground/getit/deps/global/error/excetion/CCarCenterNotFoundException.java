package kr.hackerground.getit.deps.global.error.excetion;

import kr.hackerground.getit.deps.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class CCarCenterNotFoundException extends RuntimeException{
    private final ErrorCode errorCode;

    public CCarCenterNotFoundException(){
        super();
        errorCode = ErrorCode.CAR_CENTER_NOT_FOUND;
    }
}
