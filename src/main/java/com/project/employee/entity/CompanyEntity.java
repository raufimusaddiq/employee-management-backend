package com.project.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;

    private String name;
    private String codePrefix;
	
	private Date createdDate;
    private Date modifiedDate;
    
    public Customer(String name, String codePrefix) {
        this.name = name;
        this.codePrefix = codePrefix;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCodePrefix() {
        return codePrefix;
    }
}
