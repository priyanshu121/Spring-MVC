<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>called by home controller</h1>
	<h1>url /home</h1>
	<%
		String name=(String)request.getAttribute("name");
	%>
	<h1>Name is : <%=name%></h1>
	
</body>
</html>