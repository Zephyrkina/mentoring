package ua.com.mentoring.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bug {
    private int id;
    private String description;
    private int userId;
}
