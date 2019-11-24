package ua.com.mentoring.service.impl;

import ua.com.mentoring.dto.DepartmentDto;
import ua.com.mentoring.dto.EmployeeDto;
import ua.com.mentoring.entity.Department;
import ua.com.mentoring.entity.Employee;
import ua.com.mentoring.mapping.DepartmentDtoMapper;
import ua.com.mentoring.repository.impl.DefaultDepartmentRepository;
import ua.com.mentoring.repository.DepartmentRepository;
import ua.com.mentoring.service.DepartmentService;
import ua.com.mentoring.service.EmployeeService;

import java.util.List;

public class DefaultDepartmentService implements DepartmentService {
    private DepartmentDtoMapper departmentMapper;
    private DepartmentRepository repository;
    private EmployeeService employeeService;

    public DefaultDepartmentService() {
        departmentMapper = new DepartmentDtoMapper();
        repository = new DefaultDepartmentRepository();
        employeeService = new DefaultEmployeeService();
    }

    @Override
    public Department create(DepartmentDto departmentDto) {
        Department department = departmentMapper.dataToEntity(departmentDto);
        repository.add(department);
        return department;
    }

    @Override
    public Department update(DepartmentDto departmentDto) {
        Department department = departmentMapper.dataToEntity(departmentDto);
        repository.update(department);
        return department;
    }

    @Override
    public List<Employee> getAllEmployees(int departmentId) {
        return employeeService.getEmployeesByDepartment(departmentId);
    }

    @Override
    public void assignToDepartment(EmployeeDto employeeDto, int departmentId) {
        employeeDto.setDepartmentId(departmentId);
        employeeService.update(employeeDto);
    }
}
