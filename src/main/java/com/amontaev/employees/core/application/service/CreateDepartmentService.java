package com.amontaev.employees.core.application.service;

import com.amontaev.employees.core.application.port.in.CreateDepartmentUseCase;
import com.amontaev.employees.core.application.port.out.SaveDepartmentPort;
import com.amontaev.employees.core.domain.Department;
import org.springframework.stereotype.Service;

@Service
public class CreateDepartmentService implements CreateDepartmentUseCase {
    private final SaveDepartmentPort saveDepartment;
    public CreateDepartmentService(SaveDepartmentPort saveDepartment) {
        this.saveDepartment = saveDepartment;
    }
    @Override
    public Department execute(String name) {
        Department department = new Department(name);
        return this.saveDepartment.saveDepartment(department);
    }
}
