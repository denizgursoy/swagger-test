package com.example.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
@Api(value = "Registration managament API", description = "This API used managage students' course registrations")
public class RegistrationController {

    @Autowired
    private StudentCourseManager studentCourseManager;

    @RequestMapping(value = "/registerToCourse", method = RequestMethod.POST)
    @ApiOperation(value = "Registers a student to a course")
    private void registerStudentToCourse(long stundetId, long courseId) {
        studentCourseManager.registerStudentToCourse(stundetId, courseId);
    }

}
