<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String user = (String) session.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style> body { font-family: Arial, sans-serif; margin: 40px; } a { margin-right: 14px; } </style>

</head>
<body>
	
<h2>Dashboard</h2>
    <p>Hello, <strong><%= user %></strong>. This is your dashboard.</p>
    <nav>
        <a href="<%= request.getContextPath() %>/home">Home</a>
        <a href="<%= request.getContextPath() %>/profile">Profile</a>
        <a href="<%= request.getContextPath() %>/logout">Logout</a>
    </nav>
	
</body>
</html>