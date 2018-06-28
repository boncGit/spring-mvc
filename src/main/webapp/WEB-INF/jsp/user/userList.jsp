<%--
  Created by IntelliJ IDEA.
  User: Mengxy
  Date: 2018/6/4
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <h1>用户列表</h1>
    <a href="javascript:void(0)" onclick="deleteById()">删除</a>
    <a href="javascript:void(0)" onclick="updateById()">更新</a>
    <a href="javascript:void(0)" onclick="save()">提交</a>

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
        var rootPath='${pageContext.request.contextPath}';
    </script>
    <script>
            function deleteById(){
                document.getElementById("deleteForm").submit();
            }
            function updateById(){
                document.getElementById("updateForm").submit();
            }
            function save(){
                var json = {id:"123",name:"mengxy"};
                var str = JSON.stringify(json)
                $.ajax({
                    url: rootPath + '/user/userInfo',
                    type: 'POST',
                    dataType: "json", //可以是text，如果用text，返回的结果为字符串；如果需要json格式的，可是设置为json
                    ContentType: "application/json; charset=utf-8",
                    data:{str:str},
                    success: function(data) {
                       console.log(data);
                    },
                    error: function(data) {
                        console.log(data);
                    }
                });
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
