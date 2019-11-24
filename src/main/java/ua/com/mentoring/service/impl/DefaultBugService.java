package ua.com.mentoring.service.impl;

import ua.com.mentoring.dto.BugDto;
import ua.com.mentoring.entity.Bug;
import ua.com.mentoring.mapping.BugDtoMapper;
import ua.com.mentoring.repository.BugRepository;
import ua.com.mentoring.repository.impl.DefaultBugRepository;
import ua.com.mentoring.service.BugService;

public class DefaultBugService implements BugService {
    private BugDtoMapper mapper;
    private BugRepository repository;

    public DefaultBugService() {
        mapper = new BugDtoMapper();
        repository = new DefaultBugRepository();
    }

    @Override
    public Bug create(BugDto bugDto) {
        Bug bug = mapper.dataToEntity(bugDto);
        repository.add(bug);
        return bug;
    }

    @Override
    public Bug update(BugDto bugDto) {
        Bug bug = mapper.dataToEntity(bugDto);
        repository.update(bug);
        return bug;
    }

    @Override
    public void assignToUser(BugDto bugDto, int userId) {
        Bug bug = mapper.dataToEntity(bugDto);
        bug.setUserId(userId);
        repository.update(bug);
    }
}
