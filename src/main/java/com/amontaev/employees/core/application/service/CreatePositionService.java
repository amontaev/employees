package com.amontaev.employees.core.application.service;

import com.amontaev.employees.core.application.port.in.CreatePositionUseCase;
import com.amontaev.employees.core.application.port.out.SavePositionPort;
import com.amontaev.employees.core.domain.Position;
import org.springframework.stereotype.Service;

@Service
public class CreatePositionService implements CreatePositionUseCase {
    private final SavePositionPort savePosition;
    public CreatePositionService(SavePositionPort savePosition) {
        this.savePosition = savePosition;
    }
    @Override
    public Position execute(Position position) {
        return this.savePosition.savePosition(position);
    }
}
