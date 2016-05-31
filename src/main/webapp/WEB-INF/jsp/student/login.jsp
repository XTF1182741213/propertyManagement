<%--
  Created by IntelliJ IDEA.
  User: 邱永臣
  Date: 2016-05-31
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%@include file="common/bootstrap-header.jsp" %>

    <!-- Custom styles for this template -->
    <link href="css/my/signin.css" rel="stylesheet">
    <title>登录(学生)</title>

    <script>
        function login() {
            alert("你是帅哥");
        }
    </script>
</head>

<body>


<div class="container">

    <form class="form-signin">
        <h2 class="form-signin-heading">登录系统</h2>

        <label for="inputUserName" class="sr-only">userName</label>
        <input type="text" id="inputUserName" class="form-control" placeholder="输入昵称" aria-describedby="basic-addon1"
               required>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="输入密码" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="login()">登录</button>
    </form>

</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>

