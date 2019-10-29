<%@ page import="pe.isil.model.User" %>
<%@ page import="pe.isil.dao.TeamDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.model.Team" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<h1>Welcome <%= ((User) session.getAttribute("user")).getUsername() %> !</h1>
<br>
<hr>
<br>
<%
    List<Team> teams = TeamDAO.findAllTeams();
    if (teams != null){
        System.out.println("Teams exist");
    }
%>
<table>
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>País</th>
    </tr>
    <%
        for(Team team : teams) {
    %>
    <tr>
        <td><%=team.getIdEquipo()%></td>
        <td><%=team.getNomEquipo()%></td>
        <td><%=team.getPaisEquipo()%></td>
    </tr>
    <%}%>
</table>

</body>
</html>
