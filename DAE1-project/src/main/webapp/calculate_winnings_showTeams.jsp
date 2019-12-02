<%@ page import="pe.isil.model.Team" %>
<%@ page import="pe.isil.dao.TeamDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.model.Prizepool" %>
<%@ page import="pe.isil.dao.PrizepoolDAO" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.math.RoundingMode" %>
<%@ page import="java.text.NumberFormat" %><%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 12/1/2019
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<html>
<head>
    <title>Team Winnings</title>
</head>
<body>
<%
    List<Team> teams = TeamDAO.findAllTeams();
    List<Prizepool> prizepool = PrizepoolDAO.listPrizepool();
    int amount = Integer.parseInt((String)session.getAttribute("amount"));

    DecimalFormat df = new DecimalFormat("#.##");
    df.setRoundingMode(RoundingMode.HALF_UP);
%>
<div class="container">
    <h2 class="text-center">Calcular Ganancias</h2>
    <table class="table table-bordered">
        <tr class="thead-dark">
            <th class="text-center">Nombre</th>
            <th class="text-center">País</th>
            <th class="text-center">Monto</th>
        </tr>
            <%

        for(int i = 0; i < teams.size(); i++) {
            double percent;
            String payment;
            percent = prizepool.get(i).getPercentage() / 100.0;
            System.out.println("Team winnings:" + percent + "%");
            System.out.println("Amount: " + amount);
            payment = df.format(amount * percent);
            System.out.println("Payment: " + payment);
            String formattedPayment = NumberFormat.getIntegerInstance().format(Double.parseDouble(payment));
    %>
        <tr>
            <td class="text-center"><%=teams.get(i).getNomEquipo()%></td>
            <td class="text-center"><%=teams.get(i).getPaisEquipo()%></td>
            <td class="text-center"><%="$" + formattedPayment%></td>
        </tr>
            <%}%>
</body>
</html>
