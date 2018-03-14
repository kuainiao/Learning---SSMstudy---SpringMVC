<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>welcome page</title>
  </head>
  
  <body>
  	 <!-- 
  	 	param.age的底层执行的是  request.getParameter("age");
  	 	requestScope.age的底层执行的是 request.getAttribute("age");
  	  -->
     name = ${param.pname }<br>
     age = ${param.page }<br>
  </body>
</html>
