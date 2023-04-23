package com.amontaev.employees.core.application.port.out;

import com.amontaev.employees.core.domain.Position;

public interface SavePositionPort {
    public Position savePosition(Position position);
}
