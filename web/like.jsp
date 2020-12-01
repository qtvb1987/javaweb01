<%--
  Created by IntelliJ IDEA.
  User: qingjiawen
  Date: 2020/11/30
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/likes" method="post">
    用户名:<input type="text" name="username" /><br/>
    密  码:<input type="password" name="pwd" /><br/>
    爱  好:<input type="checkbox" name="hobby" value="Basketball" />篮球
    <input type="checkbox" name="hobby" value="football" />足球<input type="checkbox" name="hobby" value="pingpang" />乒乓<br/>
    <input type="submit" />
</form>
</body>
</html>
