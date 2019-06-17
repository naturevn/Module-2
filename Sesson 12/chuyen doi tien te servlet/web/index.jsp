<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/17/2019
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Chuyển đôi tiền tệ Servlet</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2> Chuyển đổi tiền tệ</h2>
  <form method="post" action="/convert">
    <label>Rate: </label><br>
    <input type="number" name="rate" placeholder="RATE" value="22000"><br>
    <label>USD: </label>
    <input type="number" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" value="Converter">
  </form>
  </body>
</html>
