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
@Table(name = "ROLE")
@Data
@NoArgsConstructor
public class RoleEntity {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;
}
