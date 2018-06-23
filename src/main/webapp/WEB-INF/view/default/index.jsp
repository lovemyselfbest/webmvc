<%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 18-5-30
  Time: 上午11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${model},  spring mvc

    <form action="" method="post">

        <div>
            account：
            <input type="text" name="account" />
        </div>
        <div>
            password：
            <input type="text" name="password" />
        </div>
        <button type="submit">提交</button>
    </form>
    <script type="application/javascript" src="/static/a.js"></script>
</body>
</html>
