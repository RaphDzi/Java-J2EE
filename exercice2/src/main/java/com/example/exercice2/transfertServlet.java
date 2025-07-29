package com.example.exercice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/servlet")
public class transfertServlet extends HttpServlet {

    //classe personne
    public class Personne {
        private String nom;
        private String prenom;
        private int age;

        public Personne(String nom, String prenom, int age) {
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
        }
        public String getInfos() {
            return nom + ", " + prenom + ", " + age;
        }
        public String getNom() { return nom; }
        public String getPrenom() { return prenom; }
        public int getAge() { return age; }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Dupont", "Jean", 30));
        personnes.add(new Personne("Durand", "Marie", 25));
        personnes.add(new Personne("Martin", "Luc", 40));
        req.setAttribute("listePersonnes", personnes);
        req.getRequestDispatcher("/page.jsp").forward(req, resp);
    }
}