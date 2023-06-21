package kr.hackerground.getit.deps.global.error;

import kr.hackerground.getit.deps.global.error.excetion.CBadRequestException;
import kr.hackerground.getit.deps.global.error.excetion.CIllegalArgumentException;
import kr.hackerground.getit.deps.global.error.excetion.CInternalServerException;
import kr.hackerground.getit.deps.global.error.excetion.CUserNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(InterruptedException.class)
    protected ResponseEntity<ErrorResponseDto> handle(InterruptedException e) {
        ErrorCode errorCode = ErrorCode.INTERNAL_SERVER_ERROR;
        e.printStackTrace();

        return new ResponseEntity<>(new ErrorResponseDto(errorCode), errorCode.getStatusCode());
    }

    // Custom Exception

    @ExceptionHandler(CUserNotFoundException.class)
    protected ResponseEntity<ErrorResponseDto> handle(CUserNotFoundException e) {
        ErrorCode errorCode = e.getErrorCode();
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponseDto(errorCode), errorCode.getStatusCode());
    }

    @ExceptionHandler(CIllegalArgumentException.class)
    protected ResponseEntity<ErrorResponseDto> handle(CIllegalArgumentException e) {
        ErrorCode errorCode = e.getErrorCode();
        String message = e.getMessage();
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponseDto(errorCode, message), errorCode.getStatusCode());
    }
    @ExceptionHandler(CInternalServerException.class)
    protected ResponseEntity<ErrorResponseDto> handle(CInternalServerException e) {
        ErrorCode errorCode = e.getErrorCode();
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponseDto(errorCode), errorCode.getStatusCode());
    }

    @ExceptionHandler(CBadRequestException.class)
    protected ResponseEntity<ErrorResponseDto> handle(CBadRequestException e) {
        ErrorCode errorCode = e.getErrorCode();
        String message = e.getMessage();
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponseDto(errorCode, message), errorCode.getStatusCode());
    }

}