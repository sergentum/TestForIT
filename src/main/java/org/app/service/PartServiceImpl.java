package org.app.service;

import org.app.model.Part;
import org.app.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PartServiceImpl implements PartService{

//    @Autowired
//    private PartRepository partRepository;
//
//    @Override
//    public Part add(Part part) {
//        Part savedPart = partRepository.saveAndFlush(part);
//        return savedPart;
//    }
//
//    @Override
//    public void delete(long id) {
//        partRepository.delete(id);
//    }
//
//    @Override
//    public Part getByName(String name) {
//        return partRepository.findByName(name);
//    }
//
//    @Override
//    public Part edit(Part part) {
//        return partRepository.saveAndFlush(part);
//    }
//
//    @Override
//    public List<Part> getAll() {
//        return partRepository.findAll();
//    }
}
