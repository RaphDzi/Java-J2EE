<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="chienList" type="java.util.ArrayList<com.example.exercice4.model.Chien>" scope="request" />


<html>
<head>
    <title>liste des chiens</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous" defer></script>
</head>
<body>
    <main class="container">
        <h1>Liste des chiens</h1>
        <hr>

        <c:if test="${chienList.size() > 0}">
            <table class="table table-dark text-center align-middle">
                <thead>
                <tr>
                    <th>Nom</th>
                    <th>Race</th>
                    <th>Plat favoris</th>
                    <th>Date de naissance</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="c" items="${chienList}" >
                    <tr>
                        <td>${c.nom}</td>
                        <td>${c.race}</td>
                        <td>${c.dateNaissance}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${chienList.size() == 0}">
            <p>Aucun chien a presenter</p>
        </c:if>
        <hr>

        <h2>Formulaire d'ajout de chien</h2>
        <form action="${pageContext.request.contextPath}/chien" method="post">
            <div>
                <label for="nom">Nom :</label>
                <input type="text" id="nom" name="nom">
            </div>
            <div>
                <label for="race">Race :</label>
                <input type="text" id="race" name="race">
            </div>
            <div>
                <label for="dateNaissance">Date de Naissance :</label>
                <input type="date" id="dateNaissance" name="dateNaissance">
            </div>
            <button>Ajouter</button>
            <button type="reset">Annuler</button>
        </form>
    </main>
</body>
</html>
