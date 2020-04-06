package com.example.swagger;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
public class StudentCourseManager {

    List<Student> studentList= new ArrayList<>();
    List<Course> courses= new ArrayList<>();
    HashMap<Long,List<Long>> registration= new HashMap<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student getStudentById(long userId) {
        return new Student(userId, "deniz", "gursoy");
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourseById(long courseId) {
        return null;
    }

    public void registerStudentToCourse(long stundetId, long courseId) {

        if(!registration.containsKey(courseId)){
            registration.put(courseId, new ArrayList<>(Arrays.asList(stundetId)));
        }else{
            registration.get(courseId).add(stundetId);
        }
    }
}
