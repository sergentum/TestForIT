package org.app.repository;

import org.app.model.PartEntity;

import java.util.List;

public interface PartRepository {
    void add(PartEntity part);
    void update(PartEntity part);
    List<PartEntity> getAll();
    PartEntity getById(long id);
    void remove(long id);
}
