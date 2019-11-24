package ua.com.mentoring.service.impl;

import ua.com.mentoring.dto.EmployeeDto;
import ua.com.mentoring.entity.Employee;
import ua.com.mentoring.mapping.EmployeeDtoMapper;
import ua.com.mentoring.repository.impl.DefaultEmployeeRepository;
import ua.com.mentoring.repository.EmployeeRepository;
import ua.com.mentoring.service.EmployeeService;

import java.util.List;

public class DefaultEmployeeService implements EmployeeService {
    private EmployeeDtoMapper mapper;
    private EmployeeRepository repository;

    public DefaultEmployeeService() {
        mapper = new EmployeeDtoMapper();
        repository = new DefaultEmployeeRepository();
    }

    public DefaultEmployeeService(EmployeeDtoMapper mapper, EmployeeRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public Employee create(EmployeeDto employeeDto) {
        Employee employee = mapper.dataToEntity(employeeDto);
        repository.add(employee);
        return employee;
    }

    @Override
    public Employee update(EmployeeDto employeeDto) {
        Employee employee = mapper.dataToEntity(employeeDto);
        repository.update(employee);
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        return repository.getEmployees();
    }

    @Override
    public List<Employee> getEmployeesByDepartment(int departmentId) {
        return repository.getEmployeesByDepartment(departmentId);
    }
}
