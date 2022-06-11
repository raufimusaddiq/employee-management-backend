package com.project.employee.rest.request;


import lombok.Data;

import java.util.UUID;

@Data
public class CreateEmployeeRequest {

    private String employeeCode;

    private String name;

    private String codePrefix;

    private String phoneNumber;


}
