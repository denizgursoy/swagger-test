package com.example.swagger;

import com.example.swagger.exceptions.StudentAlreadyRegisteredException;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class StudentCourseManager {

    List<Student> studentList = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    HashMap<Long, List<Long>> registration = new HashMap<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student getStudentById(long userId) {
        return new Student(userId, "deniz", "gursoy");
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Optional<Course> getCourseById(long courseId) {
        return courses.stream().filter(course -> course.getCourseId() == courseId)
                .findAny();
    }

    public void registerStudentToCourse(long stundetId, long courseId) throws StudentAlreadyRegisteredException {

        if (!registration.containsKey(courseId)) {
            registration.put(courseId, new ArrayList<>(Arrays.asList(stundetId)));
        } else {
            if (registration.get(courseId).contains(stundetId)) {
                throw new StudentAlreadyRegisteredException(stundetId, courseId);
            } else {
                registration.get(courseId).add(stundetId);
            }

        }
    }
}
