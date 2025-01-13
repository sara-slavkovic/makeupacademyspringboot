package com.project.makeupacademy.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tipSminkanja")
public class TipSminkanjaEntity implements ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipaSminkanja;
    private String nazivTipaSminkanja;

    public TipSminkanjaEntity() {
        System.out.println("====================================================");
        System.out.println("Kreiran je objekat klase TipSminkanjaEntity.");
        System.out.println("====================================================");
    }

    public TipSminkanjaEntity(int idTipaSminkanja, String nazivTipaSminkanja) {
        this.idTipaSminkanja = idTipaSminkanja;
        this.nazivTipaSminkanja = nazivTipaSminkanja;
    }

    public String getNazivTipaSminkanja() {
        return nazivTipaSminkanja;
    }

    public void setNazivTipaSminkanja(String nazivTipaSminkanja) {
        this.nazivTipaSminkanja = nazivTipaSminkanja;
    }

    public int getIdTipaSminkanja() {
        return idTipaSminkanja;
    }

    public void setIdTipaSminkanja(int idTipaSminkanja) {
        this.idTipaSminkanja = idTipaSminkanja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipSminkanjaEntity that = (TipSminkanjaEntity) o;
        return idTipaSminkanja == that.idTipaSminkanja && Objects.equals(nazivTipaSminkanja, that.nazivTipaSminkanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipaSminkanja, nazivTipaSminkanja);
    }

    @Override
    public String toString() {
        return nazivTipaSminkanja;
    }
}
