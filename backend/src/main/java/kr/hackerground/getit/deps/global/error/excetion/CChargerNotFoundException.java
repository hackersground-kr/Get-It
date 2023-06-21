package kr.hackerground.getit.deps.global.error.excetion;

import kr.hackerground.getit.deps.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class CChargerNotFoundException extends RuntimeException{
    private final ErrorCode errorCode;

    public CChargerNotFoundException(){
        super();
        errorCode = ErrorCode.CHARGER_NOT_FOUND;
    }
}
