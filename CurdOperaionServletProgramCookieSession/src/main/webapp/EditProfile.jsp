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
 UserBean ub=(UserBean)application.getAttribute("ubean");
String fname=(String) request.getAttribute("fname");
out.println("page belongs to..."+fname+"<br>");
%>
<form action="update" method="post">
Address:<input type="text" name="addr" value=<%=ub.getAddress() %>><br>
MailId:<input type="text" name="mid" value=<%=ub.getmId() %>><br>
PhoneNo:<input type="text" name="phno" value=<%=ub.getPhoneNo()%>><br>
<input type="submit" value="Update">
</form>
</body>
</html>