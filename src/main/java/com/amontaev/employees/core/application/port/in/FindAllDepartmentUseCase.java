package com.amontaev.employees.core.application.port.in;

import com.amontaev.employees.core.domain.Department;

import java.util.List;

public interface FindAllDepartmentUseCase {
    public List<Department> execute();
}
