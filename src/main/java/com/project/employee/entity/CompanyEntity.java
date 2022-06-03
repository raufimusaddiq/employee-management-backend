package com.project.employee.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "COMPANY")
@Data
@NoArgsConstructor
public class CompanyEntity {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE_PREFIX")
    private String codePrefix;

    @Column(name = "CREATED_DATE")
	private Date createdDate;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

}
