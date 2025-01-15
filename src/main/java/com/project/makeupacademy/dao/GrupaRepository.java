package com.project.makeupacademy.dao;

import com.project.makeupacademy.model.GrupaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GrupaRepository extends JpaRepository<GrupaEntity, Integer> {

    List<GrupaEntity> findByNazivGrupe(String name);

    @Query("SELECT coalesce(max(idGrupe), 0) FROM GrupaEntity")
    int vratiMaksIndeks();
}
