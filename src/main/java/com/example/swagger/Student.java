package com.example.swagger;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private long studentId;
    private String name;
    private String surname;
}
