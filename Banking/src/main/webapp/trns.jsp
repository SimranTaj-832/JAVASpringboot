<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import= "com.p1.*" %>
    <%@ page import= "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transactions</title>
</head>
<body bgcolor="grey" style="text-align:center">
<% List<Banking> list=(List)request.getAttribute("data");
if(list==null){%><h1>No data present</h1>
<%}else{%><h2>Transactions:</h2>
	<TABLE BORDER=1 align="center">
	<TR><TH>TransactionID</TH><TH>Date</TH><TH>Amount</TH><TH>Process</TH></TR>
	<%for(Banking a:list){ %>
	<tr><td><%=a.getTrno() %></td>
	<td><%=a.getDate() %></td>
	<td><%=a.getAmt() %></td>
	<td><%=a.getPrcs() %></td></tr>
	<br>
	<% }} %></TABLE>
</body>
</html>