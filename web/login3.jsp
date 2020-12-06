<%--
  Created by IntelliJ IDEA.
  User: qingjiawen
  Date: 2020/12/6
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script type="text/javascript">

        function changeCode(){
            document.getElementById("img").src = "/code?t="+new Date().getTime();
        }
    </script>
</head>

<body>
<form action="/login" method="post">
    <table>
        <tr><td>用户名：</td><td><input type="text" name="username"></td></tr>
        <tr><td>密码：</td><td><input type="password" name="password"></td></tr>
        <tr><td>验证码：</td><td><input type="text" name="code"></td></tr>
        <!-- 通过向服务器发送请求，从服务器获取验证码数据 -->
        <tr><td></td><td><img id="img" src="/code" onclick="changeCode();"/><a href="#" onclick="changeCode();">换一换</a><span><%= request.getAttribute("msg")==null?"":request.getAttribute("msg") %></span></td></tr>
        <tr><td></td><td><input type="submit" value="登陆"></td></tr>
    </table>
</form>
</body>
</html>
