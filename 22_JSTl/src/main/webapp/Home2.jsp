<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
    
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>    
      
      <c:set var="name"  value="${param.name}"></c:set>
      <c:set var="city" value=" ${param.city}"></c:set>
      
      <c:choose>
      <c:when test="${name==city }">
      <h1>Name & Address Can not be Equeals</h1>
      </c:when>
      
        <c:when test="${fn:startsWith(city,'a')}">
      <h1>Invalid City</h1>
      </c:when>
      
      <c:otherwise>
      <h1>Sucessful</h1>
        <h3>Name :- </h3>  ${name} : ${fn:length(name) }
        <h3>City :- </h3> ${city} : ${fn:length(city) }
      
      <c:forEach var="i" begin="1" end="5">
      ${i} <br>
      </c:forEach>
      </c:otherwise>
      
      </c:choose>

</body>
</html>