<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
private String name;
%>

<%
  String name =  request.getParameter("name");
  this.name=this.name+name;
%>

<h3>NAME:-<%= this.name %></h3>

</body>
</html>