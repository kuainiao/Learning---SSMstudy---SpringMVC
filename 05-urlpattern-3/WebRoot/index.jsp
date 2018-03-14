<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
  		<!--
  			这是个前台路径 
  			参照路径：http://127.0.0.1:8080
  			相对路径：/images/2beauty.jpg
  			绝对路径 = 参照路径 + 相对路径 = http://127.0.0.1:8080/images/2beauty.jpg
  			
  			当前的图片在哪里存放？
  			
  			http://127.0.0.1:8080/05-urlpattern-3/images/2beauty.jpg
  		 -->
    	<!-- <img alt="pics" src="/images/2beauty.jpg"> -->
    	
    	<!-- 
    		不带斜杠的相对路径，其参照路径是：  当前的访问路径
    		当前的访问路径是：  http://127.0.0.1:8080/05-urlpattern-3
    		将相对路径转变为绝对路径后是：  http://127.0.0.1:8080/05-urlpattern-3/images/2beauty.jpg
    	 -->
    	
    	<img alt="pics" src="images/2beauty.jpg">
  </body>
</html>

















