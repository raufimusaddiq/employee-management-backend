package com.project.employee.service.impl;

import com.project.employee.entity.EmployeeEntity;
import com.project.employee.mapper.EmployeeMapper;
import com.project.employee.repository.EmployeeRepository;
import com.project.employee.rest.request.CreateEmployeeRequest;
import com.project.employee.rest.response.EmployeeDTO;
import com.project.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    @Transactional
    public EmployeeDTO createEmployee(CreateEmployeeRequest request) {
        EmployeeEntity employee = employeeMapper.toEntity(request);
        EmployeeEntity savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toDto(savedEmployee);
    }

}
