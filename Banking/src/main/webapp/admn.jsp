<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "com.p1.*" %>
    <%@ page import= "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body bgcolor="red" style="text-align:center" >
<h2>Customers :</h2>
<% List<Customer> list=(List)request.getAttribute("data1"); if(list==null){%><h1>No data found</h1><%}else{%>
	<TABLE BORDER=1 align="center">
	<TR><TH>Customer Id</TH><TH>Name</TH><TH>DateOfBirth</TH><th>Email</th><th>Password</th></TR>
	<%for(Customer c:list){ %>
	<tr><td><%=c.getCid() %></td>
	<td><%=c.getCname() %></td>
	<td><%=c.getDob() %></td>
	<td><%=c.getEmail() %></td>
	<td><%=c.getPass() %></td></tr>
	<br>
	<% }} %></TABLE></br>



<% List<Accounts> list1=(List)request.getAttribute("data2"); if(list==null){%><h1>No data found</h1><%}else{%>
	<h2>Accounts :</h2><TABLE BORDER=1 align="center">
	<TR><TH>AccountNumber</TH><TH>CustomerID</TH><TH>AccountType</TH><TH>DateOfOpening</TH><TH>Balance</TH><TH>Status</TH></TR>
	<%for(Accounts a:list1){ %>
	<tr><td><%=a.getAcnum() %></td>
	<td><%=a.getCid() %></td>
	<td><%=a.getActyp() %></td>
	<td><%=a.getDop() %></td>
	<td><%=a.getBal() %></td>
	<td><%=a.getSts() %></td></tr>
	<br>
	<% }} %></TABLE>


<h2>All Transactions :<h2>
<% List<Banking> list2=(List)request.getAttribute("data3"); if(list==null){%><h1>No data found </h1><%}else{%>
	<TABLE BORDER=1 align="center">
	<TR><TH>Transaction Number</TH><TH>Account Number</TH><TH>Date</TH><TH>Amount</TH><TH>Process</TH></TR>
	<%for(Banking b:list2){ %>
	<tr><td><%=b.getTrno() %></td>
	<td><%=b.getAcnum() %></td>
	<td><%=b.getDate() %></td>
	<td><%=b.getAmt() %></td>
	<td><%=b.getPrcs() %></td></tr>
	<br>
	<% } }%></TABLE></br>
	
<h2>Type of Accounts :</h2>
<% List<AcCtg> list3=(List)request.getAttribute("data4"); if(list==null){%><h1>No data found </h1><%}else{%>
	<TABLE BORDER=1 align="center">
	<TR><TH>Account Type</TH><TH>Account Name</TH></TR>
	<%for(AcCtg ac:list3){ %>
	<tr><td><%=ac.getType() %></td>
	<td><%=ac.getName() %></td></tr><br>
	<% }} %></TABLE></br>
<br>	
<form name="ixform" action="Index.html" method="get">
<input type=submit value="Logout"></form>
</body>
</html>