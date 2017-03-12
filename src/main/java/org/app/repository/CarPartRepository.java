package org.app.repository;

import org.app.model.CarPartEntity;

import java.util.List;

public interface CarPartRepository {
    CarPartEntity save(CarPartEntity item);
    List<CarPartEntity> getAll();
    CarPartEntity getById(long id);
    void remove(long id);
}
