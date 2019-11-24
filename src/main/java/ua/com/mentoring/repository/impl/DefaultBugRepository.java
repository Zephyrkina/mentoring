package ua.com.mentoring.repository.impl;

import ua.com.mentoring.entity.Bug;
import ua.com.mentoring.repository.BugRepository;

import java.util.HashMap;
import java.util.Map;

public class DefaultBugRepository implements BugRepository {
    private static Map<Integer, Bug> bugs = new HashMap<>();

    @Override
    public void add(Bug bug) {
        bugs.put(bug.getId(), bug);
    }

    @Override
    public void update(Bug bug) {
        bugs.remove(bug.getId());
        bugs.put(bug.getId(), bug);
    }

    @Override
    public void delete(Bug bug){
        bugs.remove(bug.getId());
    }
}
