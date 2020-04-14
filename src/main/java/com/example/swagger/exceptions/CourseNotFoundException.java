package com.example.swagger.exceptions;

import org.springframework.http.HttpStatus;

public class CourseNotFoundException extends InventoryException {

    public CourseNotFoundException(long courseId) {
        super(HttpStatus.NOT_FOUND, "Course (" + courseId + ") can not be found");
    }
}
