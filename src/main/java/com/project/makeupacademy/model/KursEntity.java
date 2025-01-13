package com.project.makeupacademy.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "kurs")
public class KursEntity implements ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idKursa;
    private String nazivKursa;
    private int trajanjeUNedeljama;

    @ManyToOne
    @JoinColumn(name = "idTipaSminkanja")
    private TipSminkanjaEntity tipSminkanja;

    @ManyToOne
    @JoinColumn(name = "idPredavaca")
    private PredavacEntity predavac;

    public KursEntity() {
        System.out.println("====================================================");
        System.out.println("Kreiran je objekat klase KursEntity.");
        System.out.println("====================================================");
    }

    public KursEntity(int idKursa, String nazivKursa, int trajanjeUNedeljama, TipSminkanjaEntity tipSminkanja, PredavacEntity predavac) {
        this.idKursa = idKursa;
        this.nazivKursa = nazivKursa;
        this.trajanjeUNedeljama = trajanjeUNedeljama;
        this.tipSminkanja = tipSminkanja;
        this.predavac = predavac;
    }

    public PredavacEntity getPredavac() {
        return predavac;
    }

    public void setPredavac(PredavacEntity predavac) {
        this.predavac = predavac;
    }

    public TipSminkanjaEntity getTipSminkanja() {
        return tipSminkanja;
    }

    public void setTipSminkanja(TipSminkanjaEntity tipSminkanja) {
        this.tipSminkanja = tipSminkanja;
    }

    public int getTrajanjeUNedeljama() {
        return trajanjeUNedeljama;
    }

    public void setTrajanjeUNedeljama(int trajanjeUNedeljama) {
        this.trajanjeUNedeljama = trajanjeUNedeljama;
    }

    public String getNazivKursa() {
        return nazivKursa;
    }

    public void setNazivKursa(String nazivKursa) {
        this.nazivKursa = nazivKursa;
    }

    public int getIdKursa() {
        return idKursa;
    }

    public void setIdKursa(int idKursa) {
        this.idKursa = idKursa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KursEntity kurs = (KursEntity) o;
        return idKursa == kurs.idKursa && trajanjeUNedeljama == kurs.trajanjeUNedeljama && Objects.equals(nazivKursa, kurs.nazivKursa) && Objects.equals(tipSminkanja, kurs.tipSminkanja) && Objects.equals(predavac, kurs.predavac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKursa, nazivKursa, trajanjeUNedeljama, tipSminkanja, predavac);
    }

    @Override
    public String toString() {
        return nazivKursa;
    }
}
