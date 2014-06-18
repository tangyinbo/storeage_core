<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/system/recommond.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="widget-box" style="border:1px solid blue">
		<div class="widget-title">
			<h5>用户列表</h5>
			<button class="btn btn-primary btn-mini"><i class=" icon-search icon-white"></i> 查询</button>
			<button class="btn btn-primary btn-mini"><i class="icon-pencil icon-white"></i> 修改</button>
			<button class="btn btn-danger btn-mini"><i class="icon-remove icon-white"></i> 删除</button>
			<a class="btn btn-primary btn-mini" href="${pageContext.request.contextPath }/user/add.jsp"><i class=" icon-pencil icon-white"></i> 新增</a>
		</div>
		<div class="widget-content nopadding">
			<table class="table table-bordered data-table">
				<thead>
					<tr>
						<th>Rendering engine</th>
						<th>Browser</th>
						<th>Platform(s)</th>
						<th>Engine version</th>
					</tr>
				</thead>
				<tbody>
					<tr class="gradeX">
						<td>Trident</td>
						<td>Internet Explorer 4.0</td>
						<td>Win 95+</td>
						<td class="center">4</td>
					</tr>
					<tr class="gradeC">
						<td>Trident</td>
						<td>Internet Explorer 5.0</td>
						<td>Win 95+</td>
						<td class="center">5</td>
					</tr>
					<tr class="gradeA">
						<td>Trident</td>
						<td>Internet Explorer 5.5</td>
						<td>Win 95+</td>
						<td class="center">5.5</td>
					</tr>
					<tr class="gradeA">
						<td>Trident</td>
						<td>Internet Explorer 6</td>
						<td>Win 98+</td>
						<td class="center">6</td>
					</tr>
					<tr class="gradeA">
						<td>Trident</td>
						<td>Internet Explorer 7</td>
						<td>Win XP SP2+</td>
						<td class="center">7</td>
					</tr>
					<tr class="gradeA">
						<td>Trident</td>
						<td>AOL browser (AOL desktop)</td>
						<td>Win XP</td>
						<td class="center">6</td>
					</tr>
					<tr class="gradeA">
						<td>Gecko</td>
						<td>Firefox 1.0</td>
						<td>Win 98+ / OSX.2+</td>
						<td class="center">1.7</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	</div>
</body>
</html>