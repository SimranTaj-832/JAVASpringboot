<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Coffee Recommandation JSP View</h1>
<p>
<%
List<String>styles=(ArrayList)request.getAttribute("styles");
Iterator it=styles.iterator();
while(it.hasNext()){
	out.print("<br>try: "+it.next());
}
%>
</body>
</html>