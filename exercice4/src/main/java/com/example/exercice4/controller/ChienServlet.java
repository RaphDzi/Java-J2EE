package com.example.exercice4.controller;

import com.example.exercice4.model.Chien;
import com.example.exercice4.service.IServiceChien;
import com.example.exercice4.service.ServiceChienBdd;
import com.example.exercice4.util.HibernateSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("chien")
public class ChienServlet extends HttpServlet {
    private IServiceChien chienService;

    @Override
    public void init() throws ServletException {
        chienService = new ServiceChienBdd(HibernateSession.getSessionFactory());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //affiche la page form
        req.setAttribute("chienList", chienService.getAll());
        req.getRequestDispatcher("/WEB-INF/chien/add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String nom = req.getParameter("nom");
        String race = req.getParameter("race");
        LocalDate dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"));
        //création chien
        Chien chien = new Chien(nom,race,dateNaissance);
        chienService.addChien(chien);
        resp.sendRedirect(getServletContext().getContextPath()+"/chien");
    }
}
