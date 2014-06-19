<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/system/recommond.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/system/pagination.js"></script>
</head>
<body style="margin:0;padding:0">
	<div class="widget-box" style="margin:0;padding:0">
		<div class="widget-title">
			<h5>用户列表</h5>
			<button class="btn btn-primary btn-mini">
				<i class=" icon-search icon-white"></i> 查询
			</button>
			<button class="btn btn-primary btn-mini">
				<i class="icon-pencil icon-white"></i> 修改
			</button>
			<button class="btn btn-danger btn-mini">
				<i class="icon-remove icon-white"></i> 删除
			</button>
			<a class="btn btn-primary btn-mini" target="main_container"
				href="${pageContext.request.contextPath }/user/add.jsp"><i
				class=" icon-pencil icon-white"></i> 新增</a>
		</div>
		<form id="page_form" action="${pageContext.request.contextPath }/system/user/list" name="ttttt">
			<input type="hidden" name="page" value="1"/>
		</form>
		<div class="widget-content nopadding">
			<table class="table table-bordered data-table">
				<thead>
					<tr>
						<th>用户帐号</th>
						<th>用户姓名</th>
						<th>性别</th>
						<th>电话</th>
						<th>邮箱</th>
						<th>状态</th>
						<th>描述</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${users}" var="item">
				<tr class="gradeX">
						<td>${item.userName }</td>
						<td>${item.realName}</td>
						<td>${item.realName }</td>
						<td>${item.phone }</td>
						<td>${item.email }</td>
						<td>${item.salt }</td>
						<td>${item.description }:
						${pagination.firstPage },
						${pagination.hasFrontPage },
						
						${pagination.currentPage },
						${pagination.hasNextPage },
						${pagination.lastPage }
						</td>
					</tr>
				</c:forEach>
					
				</tbody>
			</table>
		</div>
		<page:pagination formName="formName"></page:pagination>
	</div>
</body>
</html>