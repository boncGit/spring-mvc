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
    <form id="a1" action="save" method="post">
        <%--<label for="userName">用户名：<input id="userName" type="text" name="userName" vlaue="${user.userName}"/></label><br/>--%>
        <label for="password">密码：<input id="password" type="password" name="password" value="${user.password}"/></label><br/>
        <label for="email">邮件：<input id="email" type="text" name="email" value="${user.email}"/></label><br/>
        <label for="age">年龄：<input id="age" type="text" name="age" value="${user.age}"/></label><br/>
        <label for="province">省份：<input id="province" type="text" name="address.province" value="${user.address.province}"/></label><br/>
        <label for="city">城市：<input id="city" type="text" name="address.city" value="${user.address.city}"/></label><br/>
        <button>提交</button>
    </form>
</body>
</html>
