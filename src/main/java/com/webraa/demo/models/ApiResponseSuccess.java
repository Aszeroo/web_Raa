package com.webraa.demo.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiResponseSuccess {

    public ApiResponseSuccess(Object data) {
        this.status = true;
        this.data = data;
    }

    public ApiResponseSuccess(String message, Object data) {
        this.status = true;
        this.message = message;
        this.data = data;
    }

    private boolean status;
    private String message;
    private Object data;
}
