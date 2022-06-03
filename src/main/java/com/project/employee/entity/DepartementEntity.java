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
@Table(name = "DEPARTMENT")
@Data
@NoArgsConstructor
public class DepartementEntity {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "COMPANY_ID")
    private UUID companyId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;
}
