package com.example.exercice5.service;

import com.example.exercice5.model.Voiture;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VoitureService {

    public Voiture save(String marque, int anneeFabrication, String couleur) {
        return new Voiture(99, marque, anneeFabrication, couleur);
    }
}