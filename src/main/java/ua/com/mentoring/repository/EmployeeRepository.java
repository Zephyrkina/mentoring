package ua.com.mentoring.repository;

import ua.com.mentoring.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    void add(Employee employee);

    void update(Employee employee);

    void delete(Employee employee);

    List<Employee> getEmployees();

    List<Employee> getEmployeesByDepartment(int departmentId);


}
