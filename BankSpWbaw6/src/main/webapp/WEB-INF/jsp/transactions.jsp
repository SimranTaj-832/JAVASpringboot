<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transactions</title>
</head>
<body>
<h1>Transactions List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>TransNum</th><th>AccountNum</th><th>Date</th><th>Amount</th><th>Process</th></tr>
<c:forEach var="banking" items="${list}">
<tr><td>${banking.trno}</td>
<td>${banking.acnum }</td>
<td>${banking.date }</td>
<td>${banking.amt }</td>
<td>${banking.prcs }</td></tr>
</c:forEach>
</table>
<br/>
<a href="home">Home Page</a>
</body>
</html>