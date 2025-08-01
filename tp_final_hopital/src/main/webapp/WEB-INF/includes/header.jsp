<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>



<%
  String user = (String) session.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Hôpital Manager</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">🏥 Hôpital Manager</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarNav" aria-controls="navbarNav"
            aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav me-auto">
        <% if (user != null) { %>
        <li class="nav-item">
          <a class="nav-link" href="listPatientServlet">Liste Patients</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addPatientServlet">Ajouter Patient</a>
        </li>
        <% } %>
      </ul>
      <ul class="navbar-nav ms-auto">
        <% if (user != null) { %>
        <li class="nav-item">
          <span class="navbar-text text-white me-3">Bonjour, <%= user %></span>
        </li>
        <li class="nav-item">
          <a class="btn btn-outline-light" href="WEB-INF/auth/logout.jsp">Déconnexion</a>
        </li>
        <% } else { %>
        <li class="nav-item">
          <a href="loginRedirect" class="btn btn-outline-light">Connexion</a>

        </li>
        <% } %>
      </ul>
    </div>
  </div>
</nav>

<div class="container mt-4">
