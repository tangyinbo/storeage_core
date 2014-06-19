<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/system/recommond.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add user</title>
</head>
<body style="margin:0;padding:0;">
	<div class="container-fluid" style="margin:0;padding:0;">
		<div class="row-fluid" style="margin:0;padding:0">
			<div class="span12">
				<div class="widget-box" >
					<div class="widget-title">
						<span class="icon"> <i class="icon-align-justify"></i> </span>
						<h5>新增用户</h5>
					</div>
					<div class="widget-content nopadding">
						<form action="${pageContext.request.contextPath }/system/user/create" method="post" class="form-horizontal" />
						<div class="control-group">
							<label class="control-label">用户名:</label>
							<div class="controls">
								<input type="text" class="input-xxlarge" name="userName"/> <span class="help-block">长度不少于6位</span>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">真实姓名:</label>
							<div class="controls">
								<input type="text" name="realName" class="input-xxlarge" placeholder="This is a placeholder..." />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">邮箱:</label>
							<div class="controls">
								<input type="text" name="email" class="input-xxlarge" placeholder="This is a placeholder..." />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">电话:</label>
							<div class="controls">
								<input type="text"  name="phone" class="input-xxlarge" placeholder="This is a placeholder..." />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">年龄:</label>
							<div class="controls">
								<input type="text" name="age" class="input-xxlarge" placeholder="This is a placeholder..." />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">描述</label>
							<div class="controls">
								<textarea name="description" class="input-xxlarge"></textarea>
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn btn-primary">Save</button>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>