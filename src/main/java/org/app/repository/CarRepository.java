package org.app.repository;

import org.app.model.CarEntity;

import java.util.List;

public interface CarRepository {//extends JpaRepository<Car, Long> {

    void add(CarEntity car);
    void update(CarEntity car);
    List<CarEntity> getAll();
    CarEntity getById(long id);
    void remove(long id);

    /*@Query("SELECT c FROM Car c WHERE c.name = :name")
    Car findByName(@Param("name") String name);*/
}
