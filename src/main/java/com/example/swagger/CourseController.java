package com.example.swagger;

import com.example.swagger.exceptions.CourseNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("course")
@Api(value = "Course Management System")
public class CourseController {

    @Autowired
    private StudentCourseManager studentCourseManager;

    @PostMapping
    @ApiOperation(value = "Adds new course to system")
    public void addCourse(Course course) {
        studentCourseManager.addCourse(course);
    }

    @GetMapping
    @ApiOperation(value = "Returns a course's information with the given id")
    public Course getCourse(long courseId) throws CourseNotFoundException {
        Optional<Course> course = studentCourseManager.getCourseById(courseId);
        if (course.isPresent()) {
            return course.get();
        } else {
            throw new CourseNotFoundException(courseId);
        }
    }
}
