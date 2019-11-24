package ua.com.mentoring.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
    private int id;
    private String name;
    private int departmentId;
}
