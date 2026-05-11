<%@page import="Com.DTO.EmployeeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href=" index.html">Home</a>

<%
    ArrayList<EmployeeDTO> arrayList = ( ArrayList<EmployeeDTO>)request.getAttribute("data");
for( EmployeeDTO employeeDTO : arrayList){
%>
<%= employeeDTO.getName( )%><br>
<%= employeeDTO.getAddress()%><br>
<%= employeeDTO.getAge()%><br>
<%= employeeDTO.getSalary()%><br>
<%} %>
</body>
</html>