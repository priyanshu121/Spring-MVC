<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

<%
/* String name=(String)request.getAttribute("name");
Integer rollnumber=(Integer)request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
%>
<h1> my name is <%-- <%=name%> --%> ${name }</h1>
<h1> my roll number is <%-- <%=rollnumber%> --%>${rollnumber}</h1>
<h1> time is <%-- <%=time%> --%>${time}</h1>
<h1> this is help page</h1>

</body>
</html>