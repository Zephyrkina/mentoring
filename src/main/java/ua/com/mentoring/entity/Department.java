package ua.com.mentoring.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Department {
    private int id;
    private String name;
}
