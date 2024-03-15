package com.mh.restapi03.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    DUPLICATE(HttpStatus.BAD_REQUEST,"DUPLICATE","중복된 내용이 있습니다."),
    NOTFOUND(HttpStatus.NOT_FOUND,"NOTFOUND","해당해는 내용이없습니다."),
    TEST(HttpStatus.BAD_GATEWAY,"TEST","TEST입니다."),
    NOTUPDATEEMAIL(HttpStatus.NOT_FOUND,"NOTUPDATE","수정할이메일이없습니다."),

    LOGIN_FAILED(HttpStatus.UNAUTHORIZED, "LOGIN_FAILED", "이메일 또는 패스워드를 확인해주세요")
    ;

    private HttpStatus httpStatus;
    private String errorCode;
    private String message;

    ErrorCode(HttpStatus httpStatus, String errorCode, String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
}
