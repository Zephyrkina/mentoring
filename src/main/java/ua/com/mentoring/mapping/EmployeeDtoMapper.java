package ua.com.mentoring.mapping;

import ua.com.mentoring.dto.EmployeeDto;
import ua.com.mentoring.entity.Employee;

public class EmployeeDtoMapper {
    public Employee dataToEntity(EmployeeDto dto) {
        return Employee.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
