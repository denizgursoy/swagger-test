package com.example.swagger;

import com.example.swagger.exceptions.StudentAlreadyRegisteredException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/registration/")
@Api(value = "Registration managament API", description = "This API used managage students' course registrations")
public class RegistrationController {

    @Autowired
    private StudentCourseManager studentCourseManager;

    @PostMapping
    @ApiOperation(value = "Registers a student to a course")
    private void registerStudentToCourse(long stundetId, long courseId) throws StudentAlreadyRegisteredException {
            studentCourseManager.registerStudentToCourse(stundetId, courseId);
    }


}
