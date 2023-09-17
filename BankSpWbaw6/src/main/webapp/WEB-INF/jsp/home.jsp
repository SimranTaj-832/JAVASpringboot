<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h1>Accounts list</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>AccountNumber</th><th>Balance</th><th>AccountType</th><th>Deposit</th><th>Withdraw</th><th>Transactions</th><th>Delete</th></tr>
<c:forEach var="acc" items="${list}">
<tr><td>${acc.acnum}</td>
<td>${acc.bal }</td>
<td>${acc.actyp }</td>
<td><a href="deposit/${acc.acnum }">Deposit</a></td>
<td><a href="withdraw/${acc.acnum}">Withdraw</a></td>
<td><a href="transactions/${acc.acnum }">Transactions</a></td>
<td><a href="delete/${acc.acnum }">Delete</a></td>
</tr></c:forEach>
</table>
<br/>
<a href="accform">Create New Account</a>
<a href="index.jsp">Logout</a>
</body>
</html>