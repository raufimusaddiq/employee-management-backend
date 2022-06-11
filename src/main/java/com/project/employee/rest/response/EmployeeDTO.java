package com.project.employee.rest.response;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class EmployeeDTO {

    private UUID id;

    private String employeeCode;

    private String name;

    private String codePrefix;

    private String phoneNumber;

    private UUID company;

    private UUID department;

    private UUID companyRole;

    private Date createdDate;

    private Date modifiedDate;
}
