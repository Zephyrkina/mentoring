package ua.com.mentoring.service;

import ua.com.mentoring.dto.DepartmentDto;
import ua.com.mentoring.dto.EmployeeDto;
import ua.com.mentoring.entity.Department;
import ua.com.mentoring.entity.Employee;

import java.util.List;

public interface DepartmentService {
    Department create(DepartmentDto department);

    Department update(DepartmentDto department);

    List<Employee> getAllEmployees(int departmentId);

    void assignToDepartment(EmployeeDto employee, int departmentId);
}
