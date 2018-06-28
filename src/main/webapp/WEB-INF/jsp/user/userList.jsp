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

    <script src="${pageContext.request.contextPath}/static/js/jquery-1.8.2.min.js"></script>

    <script>
            function deleteById(){
                document.getElementById("deleteForm").submit();
            }
            function updateById(){
                document.getElementById("updateForm").submit();
            }

        $(function(){
            //js创建json对象的两种方式
            var json = {id:"123",name:"mengxy"};
            console.log(json);

            var object = new Object();
            object.id = "983737";
            object.name = "wangqiang";
            object.password = "123456";
            console.log(object);


            //将JSON对象转化为JSON字符串
            var obj = {id: "11111", name: "test", password: "654321"};
            var last=JSON.stringify(obj); //将JSON对象转化为JSON字符串
            console.log(last);

            //JSON字符串转换为JSON对象
            var obj = JSON.parse(last); //由JSON字符串转换为JSON对象
            console.log(obj);

        });




    </script>
</body>
</html>
