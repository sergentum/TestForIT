package org.app.service;

import org.app.model.PartEntity;
import org.app.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceImpl implements PartService{

    @Autowired
    private PartRepository partRepository;

    @Override
    public void add(PartEntity part) {
        partRepository.add(part);
    }

    @Override
    public void update(PartEntity part) {
        partRepository.update(part);
    }

    @Override
    public List<PartEntity> getAll() {
        return partRepository.getAll();
    }

    @Override
    public PartEntity getById(long id) {
        return partRepository.getById(id);
    }

    @Override
    public void remove(long id) {
        partRepository.remove(id);
    }
}
