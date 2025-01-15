package com.project.makeupacademy.dao;

import com.project.makeupacademy.model.PredavacEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredavacRepository extends JpaRepository<PredavacEntity, Integer> {
    
}
