package org.app.repository;

import org.app.model.PartEntity;

import java.util.List;

public interface PartRepository {
    PartEntity save(PartEntity part);
    List<PartEntity> getAll();
    PartEntity getById(long id);
    void remove(long id);
}
