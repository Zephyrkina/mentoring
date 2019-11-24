package ua.com.mentoring.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.com.mentoring.dto.EmployeeDto;
import ua.com.mentoring.entity.Employee;
import ua.com.mentoring.mapping.EmployeeDtoMapper;
import ua.com.mentoring.repository.EmployeeRepository;
import ua.com.mentoring.service.EmployeeService;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DefaultEmployeeServiceTest {
    private EmployeeService employeeService;
    @Mock
    private EmployeeDtoMapper mapper;
    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        employeeService = new DefaultEmployeeService(mapper, employeeRepository);
    }

    @Test
    void shouldCreateOneEmployee() {
        EmployeeDto employeeDto = EmployeeDto.builder().id(1).name("John").build();
        Employee expectedEmployee = Employee.builder().id(1).name("John").build();

        when(mapper.dataToEntity(employeeDto)).thenReturn(expectedEmployee);
        doNothing().when(employeeRepository).add(expectedEmployee);

        Employee actualEmployee = employeeService.create(employeeDto);

        assertThat("Expected employee wasn't created", actualEmployee, equalTo(expectedEmployee));
        verify(employeeRepository).add(expectedEmployee);
    }
}