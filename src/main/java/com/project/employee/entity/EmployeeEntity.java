package com.project.employee.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
@Data
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "EMPLOYEE_CODE")
    private String employeeCode;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NICK_NAME")
    private String codePrefix;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "COMPANY")
    private UUID company;

    @Column(name = "DEPARTMENT")
    private UUID department;

    @Column(name = "COMPANY_ROLE")
    private UUID companyRole;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;
}
