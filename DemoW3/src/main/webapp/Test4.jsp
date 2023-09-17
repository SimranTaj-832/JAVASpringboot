<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Abstract Classes in jsp</h1>
<%!
class Shape{
int x;
Shape(){x=25;}
}
%>
<% Shape myObject = new Shape(); %>
<%= myObject.x %>
</body>
</html>