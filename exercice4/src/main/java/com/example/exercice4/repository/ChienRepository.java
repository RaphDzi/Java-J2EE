package com.example.exercice4.repository;

import com.example.exercice4.model.Chien;
import org.hibernate.Session;

import java.util.List;

public class ChienRepository extends Repository<Chien>{

    public ChienRepository(Session session) { super(session);}

    @Override
    public List<Chien> findAll() {return _session.createQuery("from Chien").list();}
}
