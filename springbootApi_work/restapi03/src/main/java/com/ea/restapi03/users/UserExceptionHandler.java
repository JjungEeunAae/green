package com.ea.restapi03.users;

import com.ea.restapi03.exception.ErrorResponse;
import com.ea.restapi03.exception.LogExcetion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.security.auth.login.LoginException;
import java.time.LocalDateTime;

@ControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(LogExcetion.class)
    public final ResponseEntity<ErrorResponse> handlerLogException(LogExcetion ex) {
        //System.out.println(ex.toString());
        ErrorResponse errorResponse = ErrorResponse.builder()
                                                    .errorCode(ex.getErrorCode().getErrorCode())
                                                    .errorMessage(ex.getErrorCode().getMessage())
                                                    .errorDateTime(LocalDateTime.now())
                                                    .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
