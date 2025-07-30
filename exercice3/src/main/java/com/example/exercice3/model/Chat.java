package com.example.exercice3.model;

public class Chat {
    private String nom;
    private String race;
    private String repas;
    private String date;

    public Chat(String nom, String race, String repas, String date) {
        this.nom = nom;
        this.race = race;
        this.repas = repas;
        this.date = date;
    }

    public String getInfos() {
        return nom + ", " + race + ", " + repas + ", " + date;
    }
}
