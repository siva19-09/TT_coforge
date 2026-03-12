<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .box { max-width: 360px; margin: auto; padding: 24px; border: 1px solid #ddd; border-radius: 8px; }
        .error { color: #b00020; margin-bottom: 10px; }
        .msg { color: #0a6e0a; margin-bottom: 10px; }
        input[type=text], input[type=password] { width: 100%; padding: 8px; margin: 6px 0 12px; }
        button { padding: 8px 16px; } </style>
</head>
<body>
<div class="box">
    <h2>Please Login</h2>
	
	<%
        String paramError = request.getParameter("error");
        String msg = request.getParameter("msg");
        String reqError = (String) request.getAttribute("error");
        if (paramError != null) { %><div class="error"><%= paramError %></div><% }
        if (reqError != null)   { %><div class="error"><%= reqError %></div><% }
        if (msg != null)        { %><div class="msg"><%= msg %></div><% }
    %>
	
	<form method="post" action="<%= request.getContextPath() %>/login">
        <label>Username</label>
        <input type="text" name="username" required autofocus>
        <label>Password</label>
        <input type="password" name="password" required>
        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>