package com.project.makeupacademy.dao;

import com.project.makeupacademy.model.KursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KursRepository extends JpaRepository<KursEntity, Integer> {

//    @Query("SELECT k FROM KursEntity k WHERE k.nazivKursa = ?1")
//    List<KursEntity> findByName(String name);

    List<KursEntity> findByNazivKursa(String name);
}
