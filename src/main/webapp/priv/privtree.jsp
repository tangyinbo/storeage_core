<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/system/recommond.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css"
	href="${pageContext.request.contextPath }/static/style/jstree/style.min.css">
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/static/script/jstree/jstree.js"></script>
</head>
<body style="margin:0;padding:0">
	<div class="widget-box" style="margin:0;padding:0">
		<div class="widget-title">
			<h5>用户列表</h5>
		</div>
		<div class="widget-content nopadding">
			<div id="jstree2" class="demo" style="margin-top:2em;"></div>
			<script>
				$(function() {
					$('#jstree2').jstree({
						'plugins' : [ "wholerow", "checkbox" ],
						'core' : {
							'data' : [ {
								"text" : "Same but with checkboxes",
								"children" : [ {
									"text" : "initially selected",
									"state" : {
										"selected" : true
									}
								}, {
									"text" : "custom icon URL",
									"icon" : "http://jstree.com/tree-icon.png"
								}, {
									"text" : "initially open",
									"state" : {
										"opened" : true
									},
									"children" : [ "Another node" ]
								}, {
									"text" : "custom icon class",
									"icon" : "glyphicon glyphicon-leaf"
								} ]
							}, "And wholerow selection" ]
						}
					});
				});
			</script>
		</div>
	</div>
</body>
</html>