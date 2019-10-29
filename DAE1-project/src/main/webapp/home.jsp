<%@ page import="pe.isil.model.User" %>
<%@ page import="pe.isil.dao.TeamDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.model.Team" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<head>
    <title>Home</title>
</head>
<body>
<br>
<% String str = ((User) session.getAttribute("user")).getUsername(); %>
<h1 class="text-center" style="font-family: 'Rage Italic'">WELCOME <%= str.toUpperCase() %> </h1>
<hr>
<br>
<%
    List<Team> teams = TeamDAO.findAllTeams();
    if (teams != null){
        System.out.println("Teams exist");
    }
%>
<div class="container">
<table class="table table-bordered">
    <tr class="thead-dark">
        <th class="text-center">ID</th>
        <th class="text-center">Nombre</th>
        <th class="text-center">País</th>
    </tr>
    <%
        for(Team team : teams) {
    %>
    <tr>
        <td class="text-center"><%=team.getIdEquipo()%></td>
        <td class="text-center"><%=team.getNomEquipo()%></td>
        <td class="text-center"><%=team.getPaisEquipo()%></td>
    </tr>
    <%}%>
</table>
</div>
</body>
</html>
