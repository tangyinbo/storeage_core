<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mySys</title>
<link
	href="${pageContext.request.contextPath }/css/ui-lightness/jquery-ui-1.9.2.custom.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script
	src="${pageContext.request.contextPath }/js/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript">
	$(function() {
		$("#button").button();
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login">
		username:<input type="text" name="userName"></br> password:<input
			type="passwd" name="Passwd"></br> <input type="submit"
			value="login" />
	</form>
	<button id="button">${mes}</button>
</body>
</html>