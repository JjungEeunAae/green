package com.ea.restapi03.exception;

import com.ea.restapi03.exception.ErrorResponse;
import com.ea.restapi03.exception.LogExcetion;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.security.auth.login.LoginException;
import java.net.BindException;
import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(LogExcetion.class)
    public final ResponseEntity<ErrorResponse> handlerLogException(LogExcetion ex) {
        //ErrorCode errorCode = ex.getErrorCode();

        //System.out.println(ex.toString());
        ErrorResponse errorResponse = ErrorResponse.builder()
                                                    .errorCode(ex.getErrorCode().getErrorCode())
                                                    .errorMessage(ex.getErrorCode().getMessage())
                                                    .errorDateTime(LocalDateTime.now())
                                                    .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(UserException.class)
    public final ResponseEntity<ErrorResponse> handlerLogException(UserException e) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                                                    .errorCode(e.getErrorCode().getErrorCode())
                                                    .errorMessage(e.getErrorCode().getMessage())
                                                    .errorDateTime(LocalDateTime.now())
                                                    .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    //@ExceptionHandler(BindException.class)

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex
                                                                , HttpHeaders headers
                                                                , HttpStatusCode status
                                                                , WebRequest request) {
        System.err.println("유효성 실패 >> " + ex.getMessage());
        System.err.println("getBindingResult >> " + ex.getBindingResult());

        ErrorResponse errorResponse = ErrorResponse
                                        .builder()
                                        .errorCode(HttpStatus.BAD_REQUEST.toString())
                                        .errorMessage(ex.getBindingResult().toString())
                                        .errorDateTime(LocalDateTime.now())
                                        .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
