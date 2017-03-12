package org.app.service;

import org.app.model.CarPartEntity;

import java.util.List;

public interface CarPartService {
    CarPartEntity save(CarPartEntity item);
    List<CarPartEntity> getAll();
    CarPartEntity getById(long id);
    void remove(long id);
}
