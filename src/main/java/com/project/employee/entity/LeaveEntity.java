package com.project.employee.entity;

import liquibase.pro.packaged.e;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "LEAVE")
@Data
@NoArgsConstructor
public class LeaveEntity {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Id
    @Column(name = "EMPLOYEE_ID")
    private UUID employeeId;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "REASON")
    private String reason;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;
}
