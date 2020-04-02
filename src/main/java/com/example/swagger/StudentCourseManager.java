package com.example.swagger;

import org.springframework.stereotype.Component;

@Component
public class StudentCourseManager {
    public void addStudent(Student student) {

    }

    public Student getStudentById(long userId) {
        return new Student(userId, "deniz", "gursoy");
    }

    public void addCourse(Course course) {

    }

    public Course getCourseById(long courseId) {
        return null;
    }

    public void registerStudentToCourse(long stundetId, long courseId) {

    }
}
