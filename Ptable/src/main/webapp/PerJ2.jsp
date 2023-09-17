<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "com.p1.*" %>
    <%@ page import= "com.p1.model.*" %>
    <%@ page import= "java.util.List" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person table jsp</title>
</head>
<body>
<h2>Person Details:</h2>
<TABLE BORDER=1 >
<TR><TH>ID</TH><TH>NAME</TH></TR>
<% List<PerPojo> list=(List)request.getAttribute("data");
if(list==null){%><h1>No data present</h1>
<%}else
	for(PerPojo p:list){ %>
	<tr><td><%=p.getPid()%></td>
	<td><%=p.getPname() %></td></tr>
	<br>
	<% } %></TABLE>
</body>
</html>