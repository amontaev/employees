package com.amontaev.employees.infrastructure.repository;

import com.amontaev.employees.core.domain.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
