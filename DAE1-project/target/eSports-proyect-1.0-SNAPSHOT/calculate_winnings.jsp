<%@ page import="pe.isil.model.Tournament" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.dao.TournamentDAO" %><%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 12/1/2019
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    List<Tournament> tournaments = TournamentDAO.findAllTournament();
    if (tournaments != null){
        System.out.println("tournaments exist");
    }
%>
<form method="post" action="calculate_winnings">
    <h2 class="text-center">Calculate Winnings</h2>
    <div class="form-group">
        <input type="number" class="form-control" placeholder="Total Prizepool" name="txtWinnings" required="required">
    </div>
    <select name="tournamentList">
        <%
            for(int i = 0; i < tournaments.size(); i++) {
                System.out.println(tournaments.get(i).toString());
        %>
        <option value="<%=tournaments.get(i).getIdTorneo()%>"><%=tournaments.get(i).getNomTorneo()%></option>
        <%}%>
    </select>
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block">Calculate</button>
    </div>
</form>
</body>
</html>
