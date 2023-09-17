<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "com.p1.*" %>
    <%@ page import= "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank App Home Page</title>
</head>
<body bgcolor="grey" style="text-align:center">
<h2>Banking App Home :</h2>
<% List<Accounts> list=(List)request.getAttribute("data"); 
if(list==null){%><h1>Welcome!!</h1><%}else{%>
	<TABLE BORDER=1 align="center">
	<TR><TH>AccountNumber</TH><TH>Balance</TH><TH>AccountType</TH></TR>
	<%for(Accounts a:list){ %>
	<tr><td><%=a.getAcnum()%></td>
	<td><%=a.getBal() %></td>
	<td><%=a.getActyp() %></td></tr>
	<br>
	<% }} %></TABLE></br>
	
	<form name="dpform" action="deposit.html" method="get">
Deposit : <input type=submit value="Deposit"></form><br/>

<form name="wdform" action="withdraw.html" method="get">
Withdraw : <input type=submit value="Withdraw"></form>
<P>View Transactions</P>
<form name="acform" action="TrnSrv" method="get">
<label for=acno>Enter Account number :</label>
 <input type=text name="acno"> <br/>
<input type=submit value="View"></form><br/>

<br>	<form name="acform" action="createAc.html" method="get">
New Account: <input type=submit value="Create new Account"></form>

<br>	<form name="ixform" action="Index.html" method="get">
<input type=submit value="Logout"></form>
	
</body>
</html>