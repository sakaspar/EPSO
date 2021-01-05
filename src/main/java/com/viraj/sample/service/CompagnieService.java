package com.viraj.sample.service;

import java.util.List;

import com.viraj.sample.entity.Compagnie;

public interface CompagnieService {
    Compagnie saveCompagnie(Compagnie compagnie);
    Compagnie updateCompagnie(Compagnie compagnie);
    List<Compagnie> getAllCompagnies();
    Compagnie getCompagnie(Integer compagnieId);
    void deleteCompagnie(Integer compagnieId);
    String  getS(Integer compagnieId);
}
