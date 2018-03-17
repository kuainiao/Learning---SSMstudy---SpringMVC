<%--
  Created by IntelliJ IDEA.
  User: Tim.L
  Date: 2018/3/16
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>My ssm project</title>
  </head>
  <body>
  welcome to my ssm project!

  <form action="${pageContext.request.contextPath}/test/register.do" method="post">
      name:<input type="text" name="name">
      age:<input type="text" name="age">
      <input type="submit" value="register">
  </form>
  </body>
</html>
