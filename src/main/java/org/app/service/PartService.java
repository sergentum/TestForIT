package org.app.service;

import org.app.model.PartEntity;

import java.util.List;

public interface PartService {
    void add(PartEntity part);
    void update(PartEntity part);
    List<PartEntity> getAll();
    PartEntity getById(long id);
    void remove(long id);
}
