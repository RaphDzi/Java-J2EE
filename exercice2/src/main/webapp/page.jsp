<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.exercice2.transfertServlet.Personne" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Liste des personnes</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-4">

<div class="container">
    <h2 class="mb-4">Liste des personnes</h2>
    <table class="table table-striped">
        <thead class="table-dark">
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Âge</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Personne> personnes = (List<Personne>) request.getAttribute("listePersonnes");
            if (personnes != null && !personnes.isEmpty()) {
                for (Personne p : personnes) {
        %>
        <tr>
            <td><%= p.getNom() %></td>
            <td><%= p.getPrenom() %></td>
            <td><%= p.getAge() %></td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="3">Aucune personne à afficher.</td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>
