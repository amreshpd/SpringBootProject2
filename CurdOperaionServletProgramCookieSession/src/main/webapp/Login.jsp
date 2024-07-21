<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   UserBean ub=(UserBean)application.getAttribute("ubean");
   out.println("Welcome User...."+ub.getfName()+"<br>");
%>
<a href="view">View Profile</a>
<a href="edit">edit Profile</a>
<a href="logout">logout</a>
</body>
</html>