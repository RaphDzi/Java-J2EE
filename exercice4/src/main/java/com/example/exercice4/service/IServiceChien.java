package com.example.exercice4.service;

import com.example.exercice4.model.Chien;
import java.util.List;

public interface IServiceChien {
    List<Chien> getAll();
    void addChien(Chien chien);
}