<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
 String name =  request.getParameter("name");
String city = request.getParameter("city");

if(name.equals(city)){
%>
<h1>Name & Address Can not be Equeals</h1>
<%
}else if(city.startsWith("a")){
%>
<h1>Invalid City</h1>
<%  }  else{  %>
<h1>Sucess</h1>
<%} %>

</body>
</html>