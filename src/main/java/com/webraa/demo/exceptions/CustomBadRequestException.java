package com.webraa.demo.exceptions;

public class CustomBadRequestException extends Exception {
    public CustomBadRequestException(String errorMessage) {
        super(errorMessage);
    }
}
