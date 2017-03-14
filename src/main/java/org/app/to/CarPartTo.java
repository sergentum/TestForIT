package org.app.to;

import org.hibernate.validator.constraints.NotBlank;

public class CarPartTo {

    private Long id;

    @NotBlank
    private Long carId;

    @NotBlank
    private Long partId;

    public CarPartTo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }
}
