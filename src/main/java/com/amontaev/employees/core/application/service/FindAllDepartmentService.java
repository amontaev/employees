package com.amontaev.employees.core.application.service;

import com.amontaev.employees.core.application.port.out.LoadDepartmentPort;
import com.amontaev.employees.core.application.port.in.FindAllDepartmentUseCase;
import com.amontaev.employees.core.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllDepartmentService implements FindAllDepartmentUseCase {
    private final LoadDepartmentPort loadDepartmentPort;
    @Autowired
    public FindAllDepartmentService(LoadDepartmentPort loadDepartmentPort) {
        this.loadDepartmentPort = loadDepartmentPort;
    }
    @Override
    public List<Department> execute() {
        return this.loadDepartmentPort.loadDepartment();
    }
}
