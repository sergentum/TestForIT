package org.app.service;

import org.app.model.CarPartEntity;

import java.util.List;

public interface CarPartService {
    CarPartEntity save(CarPartEntity item, Long carId, Long partId);
    List<CarPartEntity> getAll();
    CarPartEntity getById(long id);
    void remove(long id);
}
