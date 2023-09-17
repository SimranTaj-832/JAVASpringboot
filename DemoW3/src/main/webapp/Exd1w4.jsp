<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details !</h1>
<h2>Enter Employee Data</h2>
<form name="empform" action="Exd1w4.jsp" method="Get" >
 <label for=eid>Enter Employee Id :</label>
 <input type=text name="eid"> <br/>
 <label for=ename>Employee Name :</label>
 <input type=text name="ename"> <br/>
 <label for=esal>Salary :</label>
 <input type=text name="esal"> <br/>
 <input type=submit value="Submit Data">
</form>
<%
String id;
String name="";
String salary;
id=request.getParameter("eid");
name=request.getParameter("ename");
salary=request.getParameter("esal");
%>
<%out.println(id);
out.println(name);
out.println(salary);
%>

</body>
</html>