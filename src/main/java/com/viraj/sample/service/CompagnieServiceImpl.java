package com.viraj.sample.service;

import java.util.List;

import com.viraj.sample.entity.Compagnie;
import com.viraj.sample.repository.CompagnieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompagnieServiceImpl implements CompagnieService{
    
    @Autowired
    CompagnieRepository compagnieRepository;

    @Override
    public Compagnie saveCompagnie(Compagnie compagnie) {
        return compagnieRepository.save(compagnie);
    }
    @Override
    public Compagnie updateCompagnie(Compagnie compagnie) {
        return compagnieRepository.save(compagnie);
    }


    @Override
    public List<Compagnie> getAllCompagnies() {
        return (List<Compagnie>) compagnieRepository.findAll();
    }

    @Override
    public Compagnie getCompagnie(Integer compagnieId) {
        return compagnieRepository.findById(compagnieId).get();
    }
    @Override
    public String  getS(Integer compagnieId) {
        return  compagnieRepository.findById(compagnieId).toString();
    }
    

    @Override
    public void deleteCompagnie(Integer compagnieId) {
        compagnieRepository.deleteById(compagnieId);
    }
}
