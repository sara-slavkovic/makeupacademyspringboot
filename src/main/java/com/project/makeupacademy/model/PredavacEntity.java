package com.project.makeupacademy.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "predavac")
public class PredavacEntity implements ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPredavaca;
    private String ime;
    private String prezime;
    private String email;

    public PredavacEntity() {
        System.out.println("====================================================");
        System.out.println("Kreiran je objekat klase PredavacEntity.");
        System.out.println("====================================================");
    }

    public PredavacEntity(int idPredavaca, String email, String prezime, String ime) {
        this.idPredavaca = idPredavaca;
        this.email = email;
        this.prezime = prezime;
        this.ime = ime;
    }

    public int getIdPredavaca() {
        return idPredavaca;
    }

    public void setIdPredavaca(int idPredavaca) {
        this.idPredavaca = idPredavaca;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PredavacEntity that = (PredavacEntity) o;
        return idPredavaca == that.idPredavaca && Objects.equals(ime, that.ime) && Objects.equals(prezime, that.prezime) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPredavaca, ime, prezime, email);
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
