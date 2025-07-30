<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 29/07/2025
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formulaire</title>
</head>
<body>
<h1>Ajout d'un chat</h1>
<form action="form" method="post">
  <div>
    <label for="nom">Nom : </label>
    <input type="text" id="nom" name="nom">
  </div>
  <div>
    <label for="race">Race :</label>
    <input type="text" id="race" name="race">
  </div>
  <div>
    <label for="repas">Repas favori :</label>
    <input type="text" id="repas" name="repas">
  </div>
  <div>
    <label for="dateNaissance">Date de naissance :</label>
    <input type="date" id="dateNaissance" name="dateNaissance">
  </div>
  <div>
    <button type="submit">Envoyer</button>
    <button type="reset">Annuler</button>
  </div>
</form>
</body>
</html>
