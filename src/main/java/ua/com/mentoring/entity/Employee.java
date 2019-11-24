package ua.com.mentoring.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int id;
    private String name;
    private int departmentId;
}
