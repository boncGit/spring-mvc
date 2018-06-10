<%--
  Created by IntelliJ IDEA.
  User: Mengxy
  Date: 2018/6/9
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form id="a1" action="login" method="post">
        <label for="userName">用户名：<input id="userName" type="text" name="userName"/></label>
        <label for="password">密码：<input id="password" type="password" name="password"/></label>
        <label for="email">邮件：<input id="email" type="text" name="email"/></label>
        <label for="age">年龄：<input id="age" type="text" name="age"/></label>
        <label for="province">省份：<input id="province" type="text" name="address.province"/></label>
        <label for="city">城市：<input id="city" type="text" name="address.city"/></label>
        <button>登陆</button>
    </form>
</body>
</html>
