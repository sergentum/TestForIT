package org.app.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Part")
public class PartEntity {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "partEntity")
    private List<CarPartEntity> itemList;

    public PartEntity() {
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

    public List<CarPartEntity> getItemList() {
        return itemList;
    }

    public void setItemList(List<CarPartEntity> itemList) {
        this.itemList = itemList;
    }
}
