package com.amontaev.employees.core.application.port.out;

import com.amontaev.employees.core.domain.Department;

import java.util.List;

public interface LoadDepartmentPort {
    public List<Department> loadDepartment();
}
