package ua.com.mentoring.mapping;

import ua.com.mentoring.dto.DepartmentDto;
import ua.com.mentoring.entity.Department;

public class DepartmentDtoMapper {
    public Department dataToEntity(DepartmentDto dto) {
        return Department.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }
}
