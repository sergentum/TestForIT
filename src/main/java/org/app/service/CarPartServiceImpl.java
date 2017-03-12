package org.app.service;

import org.app.model.CarPartEntity;
import org.app.repository.CarPartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPartServiceImpl implements CarPartService {

    @Autowired
    private CarPartRepository repository;

    @Override
    public CarPartEntity save(CarPartEntity item) {
        return repository.save(item);
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
