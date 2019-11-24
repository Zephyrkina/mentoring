package ua.com.mentoring.mapping;

import ua.com.mentoring.dto.BugDto;
import ua.com.mentoring.entity.Bug;

public class BugDtoMapper {
    public Bug dataToEntity(BugDto bug) {
        return Bug.builder()
                .id(bug.getId())
                .description(bug.getDescription())
                .userId(bug.getUserId())
                .build();
    }
}
