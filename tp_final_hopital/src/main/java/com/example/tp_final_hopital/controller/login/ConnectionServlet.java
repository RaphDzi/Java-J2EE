package com.example.tp_final_hopital.controller.login;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class ConnectionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if ("admin".equals(login) && "1234".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", login);
            response.sendRedirect("listPatientServlet");
        } else {
            response.sendRedirect("loginRedirect?error=1");
        }
    }
}
