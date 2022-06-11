package com.project.employee.rest.controller;

import com.project.employee.rest.request.CreateEmployeeRequest;
import com.project.employee.rest.response.EmployeeDTO;
import com.project.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest){
        EmployeeDTO employeeDTO = employeeService.createEmployee(createEmployeeRequest);
        return ResponseEntity.ok(employeeDTO);
    }

}
