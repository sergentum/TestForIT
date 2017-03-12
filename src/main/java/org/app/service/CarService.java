package org.app.service;

import org.app.model.CarEntity;

import java.util.List;

public interface CarService {
    CarEntity save(CarEntity car);
    List<CarEntity> getAll();
    CarEntity getById(long id);
    void remove(long id);
}
