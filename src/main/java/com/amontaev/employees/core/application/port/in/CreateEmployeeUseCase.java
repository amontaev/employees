package com.amontaev.employees.core.application.port.in;

import com.amontaev.employees.core.domain.Employee;

public interface CreateEmployeeUseCase {
    public Employee execute(Employee employee);
}
