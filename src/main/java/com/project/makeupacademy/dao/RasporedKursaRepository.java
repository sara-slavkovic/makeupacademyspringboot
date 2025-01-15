package com.project.makeupacademy.dao;

import com.project.makeupacademy.model.RasporedKursaEntity;
import com.project.makeupacademy.model.RasporedKursaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RasporedKursaRepository extends JpaRepository<RasporedKursaEntity, RasporedKursaId> {
}
