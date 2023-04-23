package com.amontaev.employees.core.application.port.in;

import com.amontaev.employees.core.domain.Position;

public interface CreatePositionUseCase {
    public Position execute(Position position);
}
