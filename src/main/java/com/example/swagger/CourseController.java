package com.example.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
@Api(value = "Course Management System", description = "This API is used to manage courses")
public class CourseController {

    @Autowired
    private StudentCourseManager studentCourseManager;

    @PostMapping
    @ApiOperation(value = "Adds new course to system")
    private void addCourse(Course course) {
        studentCourseManager.addCourse(course);
    }

    @GetMapping
    @ApiOperation(value = "Returns a course's information with the given id")
    private Course getCourse(long courseId) {
        return studentCourseManager.getCourseById(courseId);
    }
}
