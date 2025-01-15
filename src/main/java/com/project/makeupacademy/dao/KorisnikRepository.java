package com.project.makeupacademy.dao;

import com.project.makeupacademy.model.KorisnikEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface KorisnikRepository extends JpaRepository<KorisnikEntity, Integer> {

    @Query("SELECT k FROM KorisnikEntity k WHERE k.mejl = ?1 AND k.korisnickoIme = ?2")
    List<KorisnikEntity> nadjiPoKorisnickomImenuIMejlu(String mail, String username);

    Optional<KorisnikEntity> findByKorisnickoIme(String username);
}
