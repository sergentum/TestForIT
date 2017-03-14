package org.app.service;

import org.app.model.CarPartEntity;
import org.app.to.CarPartTo;

import java.util.List;

public interface CarPartService {
    CarPartEntity save(CarPartTo itemTo);
    List<CarPartEntity> getAll();
    CarPartEntity getById(long id);
    void remove(long id);
}
