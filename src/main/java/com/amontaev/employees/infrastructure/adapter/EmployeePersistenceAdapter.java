package com.amontaev.employees.infrastructure.adapter;

import com.amontaev.employees.core.domain.Employee;
import com.amontaev.employees.infrastructure.repository.EmployeesRepository;
import com.amontaev.employees.core.application.port.out.SaveEmployeePort;
import org.springframework.stereotype.Component;

@Component
public class EmployeePersistenceAdapter implements SaveEmployeePort {
    private final EmployeesRepository employeesRepository;
    public EmployeePersistenceAdapter(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeesRepository.save(employee);
    }
}
