<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="persons" type="java.util.ArrayList<com.example.exercice3.model.Chat>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste de Personnes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous" defer></script>
</head>
<body>
<main class="container">
    <h1>Liste de Personnes</h1>
    <hr>

    <c:if test="${chats.size() > 0}">
        <table class="table table-dark text-center align-middle">
            <thead>
            <tr>
                <th>Nom</th>
                <th>race</th>
                <th>repas</th>
                <th>date</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="c" items="${chats}" >
                <tr>
                    <td>${c.nom}</td>
                    <td>${c.race}</td>
                    <td>${c.repas}</td>
                    <td>${c.date}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${chats.size() == 0}">
        <p>Aucun chat a presenter</p>
    </c:if>


</main>
</body>
</html>
