package org.app.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "car_part")
public class CarPartEntity {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private CarEntity carEntity;

    @ManyToOne
    @JoinColumn(name = "part_id", nullable = false)
    private PartEntity partEntity;

    public CarPartEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }

    public PartEntity getPartEntity() {
        return partEntity;
    }

    public void setPartEntity(PartEntity partEntity) {
        this.partEntity = partEntity;
    }
}
