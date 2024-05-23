package com.am.restfullapi.dto.mapper;



import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.am.restfullapi.dto.EmployeeDto;
import com.am.restfullapi.entity.Employee;

@Mapper(componentModel="spring")
public interface EmployeeDtoMapper {
	
	 @Mappings({
		@Mapping(source="id",target="id")
	 })
     public EmployeeDto employeeToDto(Employee employee);
	
	  @Mappings({
		@Mapping(source="id",target="id")
	  })
     public Employee dtoToemployee(EmployeeDto employeeDto);
	  
	  @Mappings({
			@Mapping(source="id",target="id")
		  })
	  public List<EmployeeDto> employeesToDtos(List<Employee> employees);
}
