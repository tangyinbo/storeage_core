<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/system/recommond.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/static/script/jstree/dist/themes/default/style.min.css">
		<script
		src="${pageContext.request.contextPath }/static/script/common/jquery-1.10.2.min.js"></script>
		<script type="text/javascript">
</script>
</head>
<body style="margin:0;padding:0;background-color: white;">
	<div class="widget-box" style="margin:0;padding:0;padding-bottom:15px;">
		<div class="widget-title">
			<h5>用户列表</h5>
		</div>
		<div class="widget-content nopadding">
			<div id="jstree1" class="demo">
				<ul>
					<li>Root node 1
						<ul>
							<li data-jstree='{ "selected" : true }'><a href="#"><em>initially</em>
									<strong>selected</strong> </a></li>
							<li data-jstree='{}'>custom
								icon URL</li>
							<li data-jstree='{ "opened" : true }'>initially open
								<ul>
									<li>Another node</li>
								</ul>
							</li>
							<li data-jstree='{ "icon" : "glyphicon glyphicon-leaf" }'>Custom
								icon class (bootstrap)</li>
						</ul>
					</li>
					<li><a href="http://www.jstree.com">Root node 2</a></li>
				</ul>
			</div>
			<div id="jstree2" class="demo"
				style="margin-top:2em;"></div>
			<script type="text/javascript"
				src="${pageContext.request.contextPath }/static/script/jstree/dist/jstree.js"></script>
			<script type="text/javascript">
				//alert('hehe');
				$("#jstree1").jstree();
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
								"icon" : ""
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
			</script>
		</div>
	</div>
</body>
</html>