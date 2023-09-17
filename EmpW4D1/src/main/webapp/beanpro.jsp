<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp bean</title>
</head>
<body>
<UL>
<LI><B>First Name:</B>${employee.name.firstName}
<LI><B>Last Name:</B>${employee.name.lastName}
<LI><B>Company Name:</B>${employee.company.companyName}
<LI><B>Company Business:</B>${employee.company.business}
</UL>
</body>
</html>