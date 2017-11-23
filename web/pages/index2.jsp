<%--
  Created by IntelliJ IDEA.
  User: quocq
  Date: 11/23/2017
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index 2</title>
</head>
<body>
<form method="post" action="/SecondServlet">
    Number A:
    <input type="number" name="numA" value="${numA}">
    <br>
    Number B:
    <input type="number" name="numB" value="${numB}"
    <br>
    Select Operator:<br>

    <select name="sl_opt" id="sl_opt" style="width: 173px">
        <option value="Addition" ${temp =='Addition' ? 'selected' : ''}>Addition</option>
        <option value="Subtraction" ${temp =='Subtraction' ? 'selected' : ''}>Subtraction</option>
        <option value="Multiple" ${temp =='Multiple' ? 'selected' : ''}>Multiple</option>
        <option value="Divide" ${temp =='Divide' ? 'selected' : ''}>Divide</option>
    </select>

    <br>
    <br>
    <input type="submit" value="Calculate" onclick="">
</form>
</body>
</html>
