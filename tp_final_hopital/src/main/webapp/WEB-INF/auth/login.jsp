<%@ include file="/WEB-INF/includes/header.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
  <form action="login" method="post">
    <input type="text" name="login" placeholder="Login" required />
    <input type="password" name="password" placeholder="Mot de passe" required />
    <button type="submit">Connexion</button>
  </form>
<%@ include file="/WEB-INF/includes/footer.jsp" %>
