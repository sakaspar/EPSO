package com.viraj.sample.service;

import java.util.List;

import com.viraj.sample.entity.Avion;
import com.viraj.sample.repository.AvionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionServiceImpl implements AvionService {
    @Autowired
    AvionRepository avionRepository;

    @Override
    public Avion saveAvion(Avion avion) {
        return avionRepository.save(avion);
    }
    @Override
    public Avion updateAvion(Avion avion) {
        return avionRepository.save(avion);
    }


    @Override
    public List<Avion> getAllAvions() {
        return (List<Avion>) avionRepository.findAll();
    }

    @Override
    public Avion getAvion(Integer avionId) {
        return avionRepository.findById(avionId).get();
    }

    @Override
    public void deleteAvion(Integer avionId) {
        avionRepository.deleteById(avionId);
    }
}
