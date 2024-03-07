package com.ea.restapi03.exception;

import lombok.Getter;

@Getter
public class LogExcetion extends RuntimeException{
    private ErrorCode errorCode;

    public LogExcetion(ErrorCode errorCode) {
        super(errorCode.getErrorCode());
        this.errorCode = errorCode;
    }
}
