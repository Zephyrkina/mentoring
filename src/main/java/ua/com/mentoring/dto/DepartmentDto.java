package ua.com.mentoring.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentDto {
    private int id;
    private String name;
}
