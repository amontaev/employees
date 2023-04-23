package com.amontaev.employees.core.application.service;

import com.amontaev.employees.core.application.port.in.CreateEmployeeUseCase;
import com.amontaev.employees.core.domain.Employee;
import com.amontaev.employees.core.application.port.out.SaveEmployeePort;
import org.springframework.stereotype.Service;

@Service
public class CreateEmployeeService implements CreateEmployeeUseCase {
    private final SaveEmployeePort saveEmployee;
    public CreateEmployeeService(SaveEmployeePort saveEmployee) {
        this.saveEmployee = saveEmployee;
    }
    @Override
    public Employee execute(Employee employee) {
        return this.saveEmployee.saveEmployee(employee);
    }
}
