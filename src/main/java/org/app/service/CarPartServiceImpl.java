package org.app.service;

import org.app.model.CarPartEntity;
import org.app.repository.CarPartRepository;
import org.app.to.CarPartTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPartServiceImpl implements CarPartService {

    @Autowired
    private CarPartRepository repository;

    @Override
    public CarPartEntity save(CarPartTo itemTo) {
        return repository.save(itemTo);
    }

    @Override
    public List<CarPartEntity> getAll() {
        return repository.getAll();
    }

    @Override
    public CarPartEntity getById(long id) {
        return repository.getById(id);
    }

    @Override
    public void remove(long id) {
        repository.remove(id);
    }
}
