package com.example.exercice3.controller;


import com.example.exercice3.model.Chat;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "chatServlet", value = "/chat")
public class ChatServlet extends HttpServlet {

    private List<Chat> chats;


    @Override
    public void init() throws ServletException {
        chats = new ArrayList<>();
        chats.add(new Chat("pierre","mencoun","croquettes","29/07/2025"));
        chats.add(new Chat("pince","race imaginaire","croquettes","14/05/1999"));
        chats.add(new Chat("bob","race imaginaire","pâté","14/12/2022"));
        chats.add(new Chat("chaton","race imaginaire","poisson","27/04/2009"));
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("chats", chats);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}