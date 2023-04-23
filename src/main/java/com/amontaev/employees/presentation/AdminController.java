package com.amontaev.employees.presentation;

import com.amontaev.employees.core.application.port.in.CreateDepartmentUseCase;
import com.amontaev.employees.core.application.port.in.CreateEmployeeUseCase;
import com.amontaev.employees.core.application.port.in.CreatePositionUseCase;
import com.amontaev.employees.core.application.port.in.FindAllDepartmentUseCase;
import com.amontaev.employees.core.domain.Department;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Tag(name = "Администратор", description = "Методы доступные администратору")
public class AdminController {
    private final CreateDepartmentUseCase createDepartmentUseCase;
    private final CreatePositionUseCase createPositionUseCase;
    private final CreateEmployeeUseCase createEmployeeUseCase;
    private final FindAllDepartmentUseCase findAllDepartmentUseCase;
    @Autowired
    public AdminController(
        CreateDepartmentUseCase createDepartmentUseCase,
        CreatePositionUseCase createPositionUseCase,
        CreateEmployeeUseCase createEmployeeUseCase,
        FindAllDepartmentUseCase findAllDepartmentUseCase
    ) {
        this.createDepartmentUseCase = createDepartmentUseCase;
        this.createPositionUseCase = createPositionUseCase;
        this.createEmployeeUseCase = createEmployeeUseCase;
        this.findAllDepartmentUseCase = findAllDepartmentUseCase;
    }
    @Operation(summary = "Метод для добавления нового отдела")
    @PostMapping("/department/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestParam String name) {
        this.createDepartmentUseCase.execute(name);
    }
    @Operation(summary = "Метод для загрузки списка отделов")
    @GetMapping("/department/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> findAll() {
        return this.findAllDepartmentUseCase.execute();
    }
}
