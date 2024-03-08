package com.ea.restapi03.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    DUPLICATE(HttpStatus.BAD_REQUEST, "A001", "중복된 내용이 있습니다."),    // 중복에러
    NOTFOUND(HttpStatus.NOT_FOUND, "B001", "내용이 없습니다."),
    TEST(HttpStatus.BAD_GATEWAY, "C001", "TEST 입니다!!!!"),
    NOTUPDATE(HttpStatus.NOT_FOUND, "D001", "수정할 이메일이 없습니다.")
    ;

    private HttpStatus httpStatus;
    private String errorCode;
    private String message;

    // 생성자
    ErrorCode(HttpStatus httpStatus, String errorCode, String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
}
