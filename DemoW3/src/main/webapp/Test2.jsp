<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
abstract class shape{
abstract public void printshape();}%>
<% 
class circle extends shape{
	public void printshape(){
	}
	}
%>
	
<% 
circle mycircle=new circle();
mycircle.printshape();
out.println("Print circle here");
%>

</body>
</html>