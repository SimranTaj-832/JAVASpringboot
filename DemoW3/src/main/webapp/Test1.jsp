<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Factorial using Recursion</h1>
<%!
int numberfactorial(int number)
{
if(number == 1){
return number;}
else{
return number*numberfactorial(number-1);}
}%>

<%
out.println("The factorial of 5 is "+numberfactorial(5));
%>
</body>
</html>