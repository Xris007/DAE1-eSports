<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 12/1/2019
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <table class="table table-bordered">
        <tr class="thead-dark">
            <th class="text-center">Place</th>
            <th class="text-center">Percentage</th>
        </tr>

        <tr>
            <td class="text-center"><%=team.getIdEquipo()%></td>
            <td class="text-center"><%=team.getNomEquipo()%></td>
        </tr>

    </table>
</div>
</body>
</html>
