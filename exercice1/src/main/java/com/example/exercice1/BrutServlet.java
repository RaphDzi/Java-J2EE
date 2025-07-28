package com.example.exercice1;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "brutServlet", value = "/brutServlet")
public class BrutServlet extends HttpServlet {

        //return brut text
        @Override
        public void doGet(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException {
                resp.setContentType("text/plain");
                PrintWriter out = resp.getWriter();
                out.println("<h1>monPremierServlet</h1>");
        }
}
