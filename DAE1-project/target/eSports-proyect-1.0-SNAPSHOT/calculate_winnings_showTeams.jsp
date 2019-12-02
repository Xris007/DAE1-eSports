<%@ page import="pe.isil.model.Team" %>
<%@ page import="pe.isil.dao.TeamDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.model.Prizepool" %>
<%@ page import="pe.isil.dao.PrizepoolDAO" %><%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 12/1/2019
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Team Winnings</title>
</head>
<body>
<%
    List<Team> teams = TeamDAO.findAllTeams();
    if (teams != null){
        System.out.println("Teams exist");
    }
    List<Prizepool> prizepool = PrizepoolDAO.listPrizepool();

%>
<div class="container">
    <table class="table table-bordered">
        <tr class="thead-dark">
            <th class="text-center">Nombre</th>
            <th class="text-center">País</th>
            <th class="text-center">Montoi</th>
        </tr>
            <%
        for(int i = 0; i >= teams.size(); i++) {
            double payment = Double.parseDouble((String)session.getAttribute("amount"));
            payment = payment * (prizepool.get(i).getPercentage()/100);
    %>
        <tr>
            <td class="text-center"><%=teams.get(i).getNomEquipo()%></td>
            <td class="text-center"><%=teams.get(i).getPaisEquipo()%></td>
            <td class="text-center"><%="$" + payment%></td>
        </tr>
            <%}%>
</body>
</html>
