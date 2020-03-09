<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/7
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">点击</a>
<br/>
<form action="account/save" method="post" >
    <input type="text" name="name"><br/>
    <input type="text" name="money"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
