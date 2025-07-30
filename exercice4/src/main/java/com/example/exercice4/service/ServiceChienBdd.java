package com.example.exercice4.service;

import com.example.exercice4.model.Chien;
import com.example.exercice4.repository.ChienRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class ServiceChienBdd implements IServiceChien {

        private ChienRepository chienRepository;
        private SessionFactory _sessionFactory;
        private Session session;


        public ServiceChienBdd(SessionFactory _sessionFactory) {
            this._sessionFactory = _sessionFactory;
        }

        @Override
        public List<Chien> getAll() {
            List<Chien> chiens = new ArrayList<>();
            session = _sessionFactory.openSession();
            chienRepository = new ChienRepository(session);
            try {
                chiens = chienRepository.findAll();
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                session.close();
            }
            return chiens;
        }

        @Override
        public void addChien(Chien chien) {
            session = _sessionFactory.openSession();
            session.beginTransaction();
            chienRepository =  new ChienRepository(session);
            try {
                chienRepository.create(chien);
                session.getTransaction().commit();
            }catch(Exception e){
                try {
                    session.getTransaction().rollback();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }finally {
                session.close();
            }
        }
    }

