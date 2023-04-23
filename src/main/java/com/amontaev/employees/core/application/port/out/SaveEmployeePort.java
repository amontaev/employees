package com.amontaev.employees.core.application.port.out;

import com.amontaev.employees.core.domain.Employee;

public interface SaveEmployeePort {
    public Employee saveEmployee(Employee employee);
}
