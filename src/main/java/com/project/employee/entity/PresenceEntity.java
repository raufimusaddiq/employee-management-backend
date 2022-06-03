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
@Table(name = "PRESENCE")
@Data
@NoArgsConstructor
public class PresenceEntity {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Id
    @Column(name = "EMPLOYEE_ID")
    private UUID employeeId;

    @Column(name = "STATUS")
    private String status;

    @Id
    @Column(name = "LEAVE_ID")
    private UUID leaveId;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;
}
