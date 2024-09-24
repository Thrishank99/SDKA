package com.org.java.realtimeapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.org.java.realtimeapp.dto.EmployeeDto;
import com.org.java.realtimeapp.entity.Employee;

@Mapper
public interface  EmployeeMapper {
	
	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee mapEmployeetDTOToEmployee(EmployeeDto employeeDto);
    EmployeeDto mapEmployeeToEmployeeDto(Employee employee);

}
