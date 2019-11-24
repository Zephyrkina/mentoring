package ua.com.mentoring.repository.impl;

import lombok.Getter;
import lombok.Setter;
import ua.com.mentoring.entity.Department;
import ua.com.mentoring.repository.DepartmentRepository;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class DefaultDepartmentRepository implements DepartmentRepository {
    private static Map<Integer, Department> departments = new HashMap<>();

    @Override
    public void add(Department department) {
        departments.put(department.getId(), department);
    }

    @Override
    public void update(Department department) {
        departments.remove(department.getId());
        departments.put(department.getId(), department);
    }

    @Override
    public void delete(Department department){
        departments.remove(department.getId());
    }
}
