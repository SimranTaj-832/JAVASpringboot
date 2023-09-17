<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
</head>
<body>
<TABLE BORDER=5 ALIGN="CENTER">
<TR><TH CLASS="TITLE">
EL Operators
</TABLE>
<P>
<TABLE BORDER=1 ALIGN="CENTER">
<TR><TH>Arithmetic Operators
<TH>Relational Operators
<TR><TH>Expression<TH>Result<TH>Expression<TH>Result
<TR ALIGN="CENTER">
<TD>\${3+2-1}<TD>${3+2-1} <%-- Addition/Subtraction --%>
<TD>\${1&lt;2}<TD>${1<2} <%-- Numerical comparison --%>
<TR ALIGN="CENTER">
<TD>\${"1"+2}<TD>${"1"+2} <%-- String conversion --%>
<TD>\${"a"&lt;"b"}<TD>${"a"<"b"} <%-- Lexical comparison --%>
<TR ALIGN="CENTER">
<TD>\${1 + 2*3 + 3/4}<TD>${1 + 2*3 + 3/4} <%-- Mult/Div --%>
<TD>\${2/3 &gt;= 3/2}<TD>${2/3 >= 3/2} <%-- >= --%>
 
<TR ALIGN="CENTER">
<TD>\${3%2}<TD>${3%2} <%-- Modulo --%>
<TD>\${3/4 == 0.75}<TD>${3/4 == 0.75} <%-- Numeric = --%>
 
<TR ALIGN="CENTER">
<%-- div and mod are alternatives to / and % --%>
<TD>\${(8 div 2) mod 3}<TD>${(8 / 2) % 3}
<%-- Compares with "equals" but returns false for null --%>
<TD>\${null == "test"}<TD>${null == "test"}
 
<TR><TH>Logical Operators
<TH><CODE>empty</CODE> Operator
<TR><TH>Expression<TH>Result<TH>Expression<TH>Result
 
<TR ALIGN="CENTER">
<TD>\${(1&lt;2) && (4&lt;3)}<TD>${(1<2) && (4<3)} <%--AND--%>
<TD>\${empty ""}<TD>${empty ""} <%-- Empty string --%>
<TR ALIGN="CENTER">
<TD>\${(1&lt;2) || (4&lt;3)}<TD>${(1<2) || (4<3)} <%--OR--%>
<TD>\${empty null}<TD>${empty null} <%-- null --%>
<TR ALIGN="CENTER">
<TD>\${!(1&lt;2)}<TD>${!(1<2)} <%-- NOT -%>
<%-- Handles null or empty string in request param --%>
<TD>\${empty param.blah}<TD>\${empty} </TABLE>

</body>
</html>