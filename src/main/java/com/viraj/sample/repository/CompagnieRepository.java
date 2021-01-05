package com.viraj.sample.repository;

import com.viraj.sample.entity.Compagnie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompagnieRepository extends CrudRepository<Compagnie,Integer> {
    
}
