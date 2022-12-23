package com.webraa.demo.exceptions;

public class CustomInternalServerErrorException extends Exception {
    public CustomInternalServerErrorException(String errorMessage) {
        super(errorMessage);
    }
}
