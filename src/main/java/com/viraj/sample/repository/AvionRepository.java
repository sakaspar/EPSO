package com.viraj.sample.repository;

import com.viraj.sample.entity.Avion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends CrudRepository<Avion,Integer> {
    
}
