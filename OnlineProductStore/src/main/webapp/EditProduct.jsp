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
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("page belongs to..."+ab.getfName()+"<br>");
ProductBean pb=(ProductBean)request.getAttribute("pbean");
%>
<form action="update" method="post">
<input type="hidden" name="pcode" value=<%=pb.getCode()%>>
ProductPrice:<input type="text" name="price" value=<%=pb.getPrice()%>><br>
Quantity:<input type="text" name="qty" value=<%=pb.getQuantity()%>><br>
<input type="submit" value="Update">
</form>
</body>
</html>