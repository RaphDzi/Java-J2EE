package com.example.tp_final_hopital.controller.patient;

import com.example.tp_final_hopital.model.Patient;
import com.example.tp_final_hopital.util.HibernateSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet("/ajouterPatient")
public class insertDataPatientServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String dateNaissanceStr = request.getParameter("dateNaissance");
        String photo = request.getParameter("photo");
        try {
            Date dateNaissance = new SimpleDateFormat("yyyy-MM-dd").parse(dateNaissanceStr);
            Patient patient = new Patient();
            patient.setNom(nom);
            patient.setPrenom(prenom);
            patient.setDateNaissance(dateNaissance);
            patient.setPhoto(photo);
            Session session = HibernateSession.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.persist(patient);
            tx.commit();
            session.close();
            response.sendRedirect("success.jsp"); // à adapter
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("erreur.jsp");
        }
    }
}