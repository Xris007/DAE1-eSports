<%@ page import="pe.isil.model.Prizepool" %>
<%@ page import="java.util.List" %>
<%@ page import="pe.isil.dao.PrizepoolDAO" %><%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 12/1/2019
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Prizepool> prizepools = PrizepoolDAO.listPrizepool();
    if (prizepools != null){
        System.out.println("prizepool exists");
    }
%>
<%!
    int prizepoolCounter = 1;
    String txt = "txtPrizepool";
%>
<div class="container">
    <table class="table table-bordered">
        <tr class="thead-dark">
            <th class="text-center">Place</th>
            <th class="text-center">Percentage</th>
        </tr>
        <%
            for(Prizepool prizepool : prizepools) {
        %>
        <tr>
            <td class="text-center"><%=prizepool.getPlace()%></td>
            <td class="text-center"><%=prizepool.getPercentage()%></td>
            <td><div class="form-group">
                <input type="text"  class="form-control" placeholder="Edit" name="<%= txt + prizepoolCounter%>" value="${prizepool}" width="50">
            </div></td>

        </tr>
        <%
                System.out.println( txt + prizepoolCounter);
                prizepoolCounter++;
            }%>
    </table>
</div>
</body>
</html>
