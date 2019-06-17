<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/17/2019
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ứng dụng từ điển</title>
  </head>
  <body>
<h2>Ứng dụng từ điển</h2>
  <form method="post" action="/translate">
    <label> Nhập từ cần tra :</label>
    <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type = "submit" value = "Search"/>
  </form>
  </body>
</html>
