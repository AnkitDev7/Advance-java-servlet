<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
 <a href="index.html"> Home </a><br>

<%@include file = "/WEB-INF/View/message.jsp" %>

<form action="AddEmployee" method="post">
        <input type="text" name="name"  placeholder="Enter Your Name"><br>
        <input type="text" name="address"  placeholder="Enter Your address"><br>
        <input type="text" name="Age"  placeholder="Enter Your Age"><br>
        <input type="text" name="Salary"  placeholder="Enter Your salary"><br>
        <button>Add Employee</button><br>
</form>

</body>
</html>