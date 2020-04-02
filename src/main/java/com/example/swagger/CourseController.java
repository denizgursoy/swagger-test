package com.example.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("course")
@Api(value = "Course Management System" , description = "This API is used to manage courses")
public class CourseController {

    @Autowired
    private StudentCourseManager studentCourseManager;

    @RequestMapping(value = "/addCourse", method = RequestMethod.POST)
    @ApiOperation(value = "Adds new course to system")
    private void addCourse(Course course){
        studentCourseManager.addCourse(course);
    }

    @RequestMapping(value = "/getCourse", method = RequestMethod.GET)
    @ApiOperation(value = "Returns a course's information with the given id")
    private Course getCourse(long courseId){
       return studentCourseManager.getCourseById(courseId);
    }
}
