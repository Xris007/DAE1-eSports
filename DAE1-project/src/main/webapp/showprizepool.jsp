<%@ page import="pe.isil.model.Prizepool" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.dao.PrizepoolDAO" %><%--
  Created by IntelliJ IDEA.
  User: CRIS
  Date: 2/12/2019
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Prizepool> prizepools = PrizepoolDAO.listPrizepool();
    if (prizepools == null){
        System.out.println("prizepool not found");
    }
%>
<%!
    int prizepoolCounter = 1;
    String txt = "txtPrizepool";
%>

<div class="login-form">
    <form method="post" action="prizepool">
        <div class="container">
            <br>
            <h1 class="display-3 text-center">Percentage per Place</h1>
            <hr>
            <a href="prizepool.jsp" class="btn btn-link">Go to Edit </a>
            <table class="table table-bordered">
                <tr class="thead-dark">
                    <th class="text-center">ID</th>
                    <th class="text-center">Place</th>
                    <th class="text-center">Percentage</th>
                </tr>
                <%
                    for(Prizepool prizepool : prizepools) {
                %>
                <tr>
                    <td class="text-center"><%=prizepool.getIdPrizePool()%></td>
                    <td class="text-center"><%=prizepool.getPlace()%></td>
                    <td class="text-center"><%=prizepool.getPercentage()%></td>

                </tr>
                <%
                        prizepoolCounter++;
                    }%>
            </table>

        </div>
    </form>
</div>

</body>
</html>
