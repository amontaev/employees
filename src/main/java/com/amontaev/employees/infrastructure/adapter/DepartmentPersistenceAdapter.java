package com.amontaev.employees.infrastructure.adapter;

import com.amontaev.employees.core.application.port.out.LoadDepartmentPort;
import com.amontaev.employees.core.application.port.out.SaveDepartmentPort;
import com.amontaev.employees.core.domain.Department;
import com.amontaev.employees.infrastructure.repository.DepartmentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentPersistenceAdapter implements SaveDepartmentPort, LoadDepartmentPort {
    private final DepartmentRepository departmentRepository;
    public DepartmentPersistenceAdapter(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    @Override
    public Department saveDepartment(Department department) {
        return this.departmentRepository.save(department);
    }

    @Override
    public List<Department> loadDepartment() {
        return this.departmentRepository.findAll();
    }
}
