package com.example.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel(value = " Student Class that hold students information")
public class Student {
    @ApiModelProperty(value = "Ordered number given by the database")
    private long studentId;
    private String name;
    private String surname;
}
