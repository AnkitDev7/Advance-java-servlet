<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Read All Data...</h3>

<%
   List<String> list = (List<String>) session.getAttribute("data");
for(String data : list){
%>
        <h2>Name: <%= data %></h2>
<%
}
%>
</body>
</html>