<%@ page import="pe.isil.model.Team" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.dao.TeamDAO" %><%--
  Created by IntelliJ IDEA.
  User: CRIS
  Date: 2/12/2019
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<head>
    <title>Home</title>
</head>
<body>
<%
    List<Team> teams = TeamDAO.findAllTeams();
    if (teams != null){
        System.out.println("Teams exist");
    }
%>
<div class="container">
    <h1 class="display-4 text-center">Teams participating on the IT 2018</h1>
    <hr>
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
