package ua.com.mentoring.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BugDto {
    private int id;
    private String description;
    private int userId;
}
