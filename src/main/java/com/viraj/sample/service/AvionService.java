package com.viraj.sample.service;

import java.util.List;

import com.viraj.sample.entity.Avion;


public interface AvionService {
    Avion saveAvion(Avion avion);
    Avion updateAvion(Avion avion);
    List<Avion> getAllAvions();
    Avion getAvion(Integer avionId);
    void deleteAvion(Integer avionId);
}
