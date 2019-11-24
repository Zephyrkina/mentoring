package ua.com.mentoring.service;

import ua.com.mentoring.dto.EmployeeDto;
import ua.com.mentoring.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(EmployeeDto employee);

    Employee update(EmployeeDto employee);

    List<Employee> getEmployees();

    List<Employee> getEmployeesByDepartment(int departmentId);
}
