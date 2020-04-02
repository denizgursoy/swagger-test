package com.example.swagger;

import org.springframework.stereotype.Component;

@Component
public class StudentCourseManager {
    public void addStudent(Student student) {

    }

    public Student getStudentById(long userId) {
        return  new Student(userId,"deniz","gursoy");
    }
}
