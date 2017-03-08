package org.app.service;

import org.app.model.CarEntity;
import org.app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void add(CarEntity car) {
        carRepository.add(car);
    }

    @Override
    public void update(CarEntity car) {
        carRepository.update(car);
    }

    @Override
    public List<CarEntity> getAll() {
        return carRepository.getAll();
    }

    @Override
    public CarEntity getById(long id) {
        return carRepository.getById(id);
    }

    @Override
    public void remove(long id) {
        carRepository.remove(id);
    }
}