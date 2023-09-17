<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Employee</h1>
<form:form method="post" action="save">
<table>
<tr><td>EmpId:</td><td><form:input path="id"/></td>
<tr><td>Name:</td><td><form:input path="name"/></td>
<tr><td>Salary:</td><td><form:input path="salary"/></td>
<tr><td></td><td><input type="submit" value="Save"/></td>


</table>
</form:form>
</body>
</html>