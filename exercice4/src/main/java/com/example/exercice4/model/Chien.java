package com.example.exercice4.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Chien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String race;
    //date
    @Temporal(TemporalType.DATE)
    private LocalDate dateNaissance;

    public Chien(){}

    public Chien(String nom, String race, LocalDate dateNaissance) {
        this.nom = nom;
        this.race = race;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getRace() {return race;}
    public void setRace(String race) {this.race = race;}
    public LocalDate getDateNaissance() {return dateNaissance;}
    public void setDateNaissance(LocalDate dateNaissance) {this.dateNaissance = dateNaissance;}
}
