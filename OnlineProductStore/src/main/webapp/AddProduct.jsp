<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String msg = (String) request.getAttribute("msg");
	out.println(msg);
	%>
	<a href="Product.html">AddProduct</a>&nbsp;
	<a href="view">ViewAllProduct</a>&nbsp;
	<a href="logout">Logout</a>
</body>
</html>