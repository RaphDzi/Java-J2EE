package com.example.exercice3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/form")
public class FormSaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/form.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom =  req.getParameter("nom");
        String race = req.getParameter("race");
        String repas = req.getParameter("repas");
        String dateNaissance = req.getParameter("dateNaissance");

        System.out.println("nom:"+nom);
        System.out.println("race:"+race);
        System.out.println("repas:"+repas);
        System.out.println("dateNaissance:"+dateNaissance);

        resp.sendRedirect(getServletContext().getContextPath());
    }
}


