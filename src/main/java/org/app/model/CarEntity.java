package org.app.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name="car_part",
            joinColumns = @JoinColumn(name="car_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="part_id", referencedColumnName="id")
    )
    private Set<PartEntity> parts;

    public CarEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PartEntity> getParts() {
        return parts;
    }

    public void setParts(Set<PartEntity> parts) {
        this.parts = parts;
    }
}
