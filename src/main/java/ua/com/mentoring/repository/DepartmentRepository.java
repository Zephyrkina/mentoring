package ua.com.mentoring.repository;

import ua.com.mentoring.entity.Department;

public interface DepartmentRepository {
    void add(Department department);

    void update(Department department);

    void delete(Department department);
}
