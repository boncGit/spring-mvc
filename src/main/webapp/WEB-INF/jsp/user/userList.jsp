<%--
  Created by IntelliJ IDEA.
  User: Mengxy
  Date: 2018/6/4
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <h1>用户列表</h1>
    <a href="javascript:void(0)" onclick="deleteById()">删除</a>
    <a href="javascript:void(0)" onclick="updateById()">更新</a>

    <form action="userInfo/1" method="post" id="deleteForm">
        <input type="text" name="_method" value="delete"/>
        <button>delete提交</button>
    </form>

    <form action="userInfo/1" method="post" id="updateForm">
        <input type="text" name="_method" value="put"/>
        <button>update提交</button>
    </form>

    <script>
            function deleteById(){
                document.getElementById("deleteForm").submit();
            }
            function updateById(){
                document.getElementById("updateForm").submit();
            }

    </script>
</body>
</html>
