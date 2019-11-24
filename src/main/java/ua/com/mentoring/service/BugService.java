package ua.com.mentoring.service;

import ua.com.mentoring.dto.BugDto;
import ua.com.mentoring.entity.Bug;

public interface BugService {
    Bug create(BugDto bug);

    Bug update(BugDto bug);

    void assignToUser(BugDto bug, int userId);
}
