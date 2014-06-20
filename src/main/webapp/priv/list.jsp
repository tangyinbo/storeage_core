<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/system/recommond.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/script/system/pagination.js"></script>
</head>
<body style="margin:0;padding:0">
	<div class="widget-box" style="margin:0;padding:0">
		<div class="widget-title">
			<h5>用户列表</h5>
			<button class="btn btn-primary btn-mini" onclick="javascript:$('#page_form').submit();return false;">
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
		<form id="page_form"
			action="${pageContext.request.contextPath }/system/priv/list"
			name="priv_form">
			<input type="hidden" name="page" id="page" value="${empty pagination?1:pagination.currentPage}" />
			<input type="hidden" id="page_count" value="${empty pagination?1:pagination.pageCount}" />
		</form>
		<div class="widget-content nopadding">
			<table class="table table-bordered data-table">
				<thead>
					<tr>
						<th>权限ID</th>
						<th>permission</th>
						<th>父级权限</th>
						<th>权限URL</th>
						<th>权限类别</th>
						<th>描述</th>
						<th>状态</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${privs}" var="item">
						<tr class="gradeX">
							<td>${item.privId }</td>
							<td>${item.permission}</td>
							<td>${item.parentPriv }</td>
							<td>${item.privUrl }</td>
							<td>${item.type }</td>
							<td>${item.description }</td>
							<td>${item.stat }</td>
						</tr>
					</c:forEach>
					<c:if test="${empty privs || fn:length(privs)==0 }">
						<tr>
							<td colspan="6">
								<c:if test="${empty privs}">
									<div  style="text-align: center">请先执行查询</div>
								</c:if>
								<c:if test="${!empty privs&&fn:length(privs)==0}">
									<div style="text-align: center">当前查询条件无记录</div>
								</c:if>
							</td>
						</tr>
					</c:if>
				</tbody>
			</table>
		</div>
		<c:if test="${!empty privs && fn:length(privs)>0 }">
			<page:pagination formName="formName"></page:pagination>
		</c:if>
	</div>
</body>
</html>