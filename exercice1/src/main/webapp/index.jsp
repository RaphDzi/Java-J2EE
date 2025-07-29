<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<jsp:include page="WEB-INF/composant/header.jsp"></jsp:include>
<body>
<h1><%= "Welcome!" %>
</h1>
<br/>
<a href="brutServlet">brut text content servlet</a>
<a href="htmlServlet">html text Servlet</a>
<a href="transfertServlet">transfert to a JSP file Servlet</a>
</body>
</html>