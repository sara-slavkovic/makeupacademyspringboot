package com.project.makeupacademy.dao;

import com.project.makeupacademy.model.TipSminkanjaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TipSminkanjaRepository extends JpaRepository<TipSminkanjaEntity, Integer> {

//    @Query("SELECT ts FROM TipSminkanjaEntity ts WHERE ts.nazivTipaSminkanja = ?1")
//    List<TipSminkanjaEntity> findByName(String name);

    List<TipSminkanjaEntity> findByNazivTipaSminkanja(String name);
}
