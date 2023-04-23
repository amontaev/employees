package com.amontaev.employees.core.application.port.out;

import com.amontaev.employees.core.domain.Department;

public interface SaveDepartmentPort {
    public Department saveDepartment(Department department);
}
