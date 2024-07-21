<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	AdminBean ab = (AdminBean) session.getAttribute("abean");
	out.println("Welcome Admin..." + ab.getfName() + "<br>");
	%>
	<a href="Product.html">AddProduct</a>&nbsp;
	<a href="view">ViewAllProduct</a>&nbsp;
	<a href="logout">Logout</a>
</body>
</html>