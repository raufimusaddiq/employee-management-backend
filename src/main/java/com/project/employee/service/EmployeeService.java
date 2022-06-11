package com.project.employee.service;

import com.project.employee.rest.request.CreateEmployeeRequest;
import com.project.employee.rest.response.EmployeeDTO;

public interface EmployeeService {

    EmployeeDTO createEmployee(CreateEmployeeRequest request);

}
