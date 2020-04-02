package com.example.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Student Affairs System", description = "This API is used to make simple students registration affairs like adding, and  removing")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentCourseManager studentCourseManager;

    @RequestMapping(value = "addStudent", method = RequestMethod.POST)
    @ApiOperation(value = "Registers a new student to system")
    public void addStudent(Student student) {
        studentCourseManager.addStudent(student);
    }

    @RequestMapping(value = "getStudent", method = RequestMethod.GET)
    @ApiOperation(value = "Returns a student's information with a given id")
    public Student getStudent(long studentId) {
        return studentCourseManager.getStudentById(studentId);
    }


}