package com.example.exercice1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/pageBootstrap2")
public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("mode","jstl");
        req.setAttribute("nom","raphael");
        req.getRequestDispatcher("/pageBootstrap2.jsp").forward(req,resp);
    }
}