package com.example.swagger.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class InventoryException extends Exception {

    private final HttpStatus status;
    @Getter
    private final String message;

    @Getter
    private final String target;

    public InventoryException(HttpStatus httpStatus, String message) {
        this.status = httpStatus;
        this.message = message;
        this.target = null;
    }

    public InventoryException(HttpStatus httpStatus, String message, String target) {
        this.status = httpStatus;
        this.message = message;
        this.target = target;

    }

    public HttpStatus getStatus() {
        return status;
    }
}
