<%@page import="org.apache.shiro.SecurityUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>jQuery UI Example Page</title>
	<link href="css/ui-lightness/jquery-ui-1.9.2.custom.css" rel="stylesheet">
	<script src="js/jquery-1.8.3.js"></script>
	<script src="js/jquery-ui-1.9.2.custom.js"></script>
	<script>
	</script>
</head>
<body>
	<%=SecurityUtils.getSubject().getPrincipal() %>
	<a href="${pageContext.request.contextPath}/user/first">${pageContext.request.contextPath}/user/first</a>
</body>
</html>