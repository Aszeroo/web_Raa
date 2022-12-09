package com.webraa.demo.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiResponseError {

    public ApiResponseError(String errorCode, String message) {
        this.status = false;
        this.errorCode = errorCode;
        this.message = message;
    }

    private boolean status;
    private String message;
    private String errorCode;
    private Object data;
}
