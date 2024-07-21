<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.*,test.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)application.getAttribute("ubean");
String fname=(String)request.getAttribute("fname");
out.println("page belongs to...."+fname+"<br>");
out.println(ub.getfName()+"&nbsp&nbsp"+ub.getuName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"+
  ub.getAddress()+"&nbsp&nbsp"+ub.getPhoneNo()+"&nbsp&nbsp"+
		"<a href='edit'>Edit</a>"+"<br>");
%>
<a href="logout">Logout</a>
</body>
</html>