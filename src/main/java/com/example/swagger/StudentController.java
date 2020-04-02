package com.example.swagger;

import io.swagger.annotations.*;
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
    @ApiOperation(value = "Registers a new student to  the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public void addStudent(Student student) {
        studentCourseManager.addStudent(student);
    }

    @RequestMapping(value = "getStudent", method = RequestMethod.GET)
    @ApiOperation(value = "Returns a student's information with a given id")
    public Student getStudent(@ApiParam(value = "Student's unique id given by the system") long studentId) {
        return studentCourseManager.getStudentById(studentId);
    }


}