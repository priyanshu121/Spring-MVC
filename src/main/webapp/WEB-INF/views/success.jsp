<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> ${Header }</h1>
<p>${Desc }</p>
<hr>

<h1> Welcome, ${user.name }</h1>
<h1> Your email address is ${user.email }</h1>
<h1> Your password is ${user.pass }, Please try to secure the password</h1>


</body>
</html>