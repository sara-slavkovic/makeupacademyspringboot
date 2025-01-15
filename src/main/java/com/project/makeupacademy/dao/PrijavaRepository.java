package com.project.makeupacademy.dao;

import com.project.makeupacademy.model.PrijavaEntity;
import com.project.makeupacademy.model.PrijavaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrijavaRepository extends JpaRepository<PrijavaEntity, PrijavaId> {
}
