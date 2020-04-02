package com.example.swagger;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private long courseId;
    private String courseName;
    private int courseCapacity;
}
