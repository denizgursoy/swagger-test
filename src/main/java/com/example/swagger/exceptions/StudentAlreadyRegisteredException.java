package com.example.swagger.exceptions;

import org.springframework.http.HttpStatus;

public class StudentAlreadyRegisteredException extends InventoryException {

    public StudentAlreadyRegisteredException(long stundetId, long courseId) {
        super(HttpStatus.NOT_ACCEPTABLE, "This student (" + stundetId + ") is already registred to the course (" + courseId + ")");
    }
}
