package com.example.swagger.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class InventoryException extends Exception {
    @Getter
    private HttpStatus status;
    @Getter
    private String message;

    @Getter
    private String target;

    public InventoryException(HttpStatus httpStatus, String message) {
        this.status = httpStatus;
        this.message = message;
    }

    public InventoryException(HttpStatus httpStatus, String message, String target) {
        this(httpStatus, message);
        this.message = message;
    }
}
