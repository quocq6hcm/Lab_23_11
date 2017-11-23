<%--
  Created by IntelliJ IDEA.
  User: quocq
  Date: 11/23/2017
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>My calculator</h1>

<form action="CalculateServlet" method="post">
    Number A:
    <input type="number" name="numA" value="${numA}">
    Number B:
    <input type="number" name="numB" value="${numB}">

    <br>
    <input type="submit" name="cong_submit" value="Cộng" onclick="this.form.action='/CongServlet' ">
    <br>
    <input type="submit" name="tru_submit" value="Trừ" onclick="this.form.action='/TruServlet' ">
    <br>
    <input type="submit" name="nhan_submit" value="Nhân" onclick="this.form.action='/NhanServlet' ">
    <br>
    <input type="submit" name="chia_submit" value="Chia" onclick="this.form.action='/ChiaServlet' ">



</form>
</body>
</html>
