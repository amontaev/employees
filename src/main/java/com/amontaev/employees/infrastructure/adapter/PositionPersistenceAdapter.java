package com.amontaev.employees.infrastructure.adapter;

import com.amontaev.employees.core.domain.Position;
import com.amontaev.employees.infrastructure.repository.PositionRepository;
import com.amontaev.employees.core.application.port.out.SavePositionPort;
import org.springframework.stereotype.Component;

@Component
public class PositionPersistenceAdapter implements SavePositionPort {
    private final PositionRepository positionRepository;
    public PositionPersistenceAdapter(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }
    @Override
    public Position savePosition(Position position) {
        return this.positionRepository.save(position);
    }
}
