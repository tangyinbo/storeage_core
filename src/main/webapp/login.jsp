<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>fly</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/bootstrap-responsive.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/unicorn.login.css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<div id="logo">
		<img
			src="${pageContext.request.contextPath }/static/style/img/logo.png"
			alt="" />
	</div>
	<div id="loginbox">
		<form id="loginform" class="form-vertical"
			action="${pageContext.request.contextPath }/login" method="post" />
		<p>
			<c:choose>
				<c:when test="${msg !=null }">
					${msg }
					</c:when>
				<c:otherwise>
					请输入用户名密码
					</c:otherwise>
			</c:choose>
		</p>
		<div class="control-group">
			<div class="controls">
				<div class="input-prepend">
					<span class="add-on"><i class="icon-user"></i> </span><input
						type="text" placeholder="userName" name="userName"/>
				</div>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<div class="input-prepend">
					<span class="add-on"><i class="icon-lock"></i> </span><input
						type="password" placeholder="Password"  name="password"/>
				</div>
			</div>
		</div>
		<div class="form-actions">
			<span class="pull-left"><a href="#" class="flip-link"
				id="to-recover">忘记密码?</a> </span> <span class="pull-right"><input
				type="submit" class="btn btn-inverse" value="登录" /> </span>
		</div>
		</form>
		<form id="recoverform" action="#" class="form-vertical" />
		<p>Enter your e-mail address below and we will send you
			instructions how to recover a password.</p>
		<div class="control-group">
			<div class="controls">
				<div class="input-prepend">
					<span class="add-on"><i class="icon-envelope"></i> </span><input
						type="text" placeholder="E-mail address" />
				</div>
			</div>
		</div>
		<div class="form-actions">
			<span class="pull-left"><a href="#" class="flip-link"
				id="to-login">&lt; 返回登录</a> </span> <span class="pull-right"><input
				type="submit" class="btn btn-inverse" value="Recover" /> </span>
		</div>
		</form>
	</div>

	<script
		src="${pageContext.request.contextPath }/static/script/main/jquery.min.js"></script>
    <script
    src="${pageContext.request.contextPath }/static/script/common/common.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/unicorn.login.js"></script>
</body>
</html>
