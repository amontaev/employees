package com.amontaev.employees.infrastructure.repository;

import com.amontaev.employees.core.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
