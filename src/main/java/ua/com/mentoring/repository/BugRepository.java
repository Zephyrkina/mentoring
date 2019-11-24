package ua.com.mentoring.repository;

import ua.com.mentoring.entity.Bug;

public interface BugRepository {
    void add(Bug bug);

    void update(Bug bug);

    void delete(Bug bug);

}
