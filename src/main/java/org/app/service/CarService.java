package org.app.service;

import org.app.model.CarEntity;

import java.util.List;

public interface CarService {
    void add(CarEntity car);
    void update(CarEntity car);
    List<CarEntity> getAll();
    CarEntity getById(long id);
    void remove(long id);
}
