<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>This is a JSP Page</h1>

// Scriptlet Tag
<%
int a = 10;
int b = 20;
out.print(a+b);
xyz(a,b);
%>

// Expression Tag
<%= a+b %>

// Declarative tag
<%!  
int res;
public void xyz(int i, int j){
	res = i + j ;
}
%>

<%= res %>
</body>
</html>