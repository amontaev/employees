package com.amontaev.employees.core.application.port.in;

import com.amontaev.employees.core.domain.Department;

public interface CreateDepartmentUseCase {
    public Department execute(String name);
}
