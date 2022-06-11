package com.project.employee.mapper;

import com.project.employee.entity.EmployeeEntity;
import com.project.employee.rest.request.CreateEmployeeRequest;
import com.project.employee.rest.response.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeEntity toEntity(CreateEmployeeRequest request);

    EmployeeDTO toDto(EmployeeEntity employee);
}
