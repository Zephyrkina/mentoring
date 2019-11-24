package ua.com.mentoring.repository.impl;

import lombok.Getter;
import lombok.Setter;
import ua.com.mentoring.entity.Employee;
import ua.com.mentoring.repository.EmployeeRepository;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class DefaultEmployeeRepository implements EmployeeRepository {
    private static Map<Integer, Employee> employees = new HashMap<>();

    @Override
    public void add(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void update(Employee employee) {
        employees.remove(employee.getId());
        employees.put(employee.getId(), employee);
    }

    @Override
    public void delete(Employee employee){
        employees.remove(employee.getId());
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.addAll(employees.values());
        return list;
    }

    @Override
    public List<Employee> getEmployeesByDepartment(int departmentId) {
        List<Employee> list = new ArrayList<>();
        list.addAll(employees.values());
        List<Employee> filteredList = list.stream().filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
        return filteredList;
    }
}
