package com.amontaev.employees.infrastructure.repository;

import com.amontaev.employees.core.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Integer> {
}
