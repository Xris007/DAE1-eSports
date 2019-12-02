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
    <title>Calculate Winnings</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<%
    List<Tournament> tournaments = TournamentDAO.findAllTournament();
    if (tournaments != null){
        System.out.println("tournaments exist");
    }
%>
<div class="container">
    <h2 class="text-center">Calculate Winnings</h2>
    <form method="post" action="calculate_winnings" class="form-horizontal">
        <div class="form-group">
            <label class="control-label col-sm-2" for="przpool">Prizepool:</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" placeholder="Total Prizepool" name="txtWinnings" required="required" id="przpool">
            </div>

        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="selecttourt">Select Tournament:</label>
            <div class="col-sm-10">
                <select name="tournamentList" id="selecttourt" class="form-control">
                    <%
                        for(int i = 0; i < tournaments.size(); i++) {
                            System.out.println(tournaments.get(i).toString());
                    %>
                    <option value="<%=tournaments.get(i).getIdTorneo()%>"><%=tournaments.get(i).getNomTorneo()%></option>
                    <%}%>
                </select>

            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary ">Calculate</button>
            </div>

        </div>
    </form>

</div>

</body>
</html>
