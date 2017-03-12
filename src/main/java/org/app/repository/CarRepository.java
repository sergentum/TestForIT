package org.app.repository;

import org.app.model.CarEntity;

import java.util.List;

public interface CarRepository {
    CarEntity save(CarEntity car);
    List<CarEntity> getAll();
    CarEntity getById(long id);
    void remove(long id);
}
