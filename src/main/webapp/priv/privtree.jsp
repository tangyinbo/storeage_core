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
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/static/script/jstree/dist/themes/jstree_.css">
<script
	src="${pageContext.request.contextPath }/static/script/common/jquery-1.10.2.min.js"></script>
</head>
<body
	style="margin:0;padding:0;background-color: white;min-height: 600px">
	<div class="widget-box" style="margin:0;padding:0;padding-bottom:15px;">
		<div class="widget-title">
			<h5>用户列表a</h5>
		</div>
		<div class="widget-content nopadding">
			<div
				style="height:500px;width:250px;overflow: scroll;scrollbar-base-color:red;position: absolute;left: 0">
	<!-- 			<div id="jstree1" 
					style="margin-top:2em;borde:1px solid red"></div> -->
				<div id="jstree2" 
					style="margin-top:2em;borde:1px solid red"></div>
			<!-- 	<div id="jstree3" 
					style="margin-top:2em;borde:1px solid red"></div> -->
			</div>
			<div
				style="border:1px solid #ccc;margin-left: 260px;height:100%;margin-top: 0;margin-bottom: 20px;">
				<div id="j_value" style="margin-top:50px"></div>
			</div>
			<script type="text/javascript"
				src="${pageContext.request.contextPath }/static/script/jstree/dist/jstree.js"></script>

		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			$
					.ajax({
						type : "POST",
						url : "${pageContext.request.contextPath }/system/priv/privTree",
						data : "",
						dataType : "json",
						success : function(data) {
							$('#jstree2').jstree({
								'plugins' : [  ],
								'core' : {
									'data' : data
								}
							}).bind('select_node.jstree',function(e,data){
							$("#j_value").html("你选中了   id-->"+data.selected+"    txt:-->"+data.instance.get_node(data.selected).text);
								//console.log(data.selected);
								//console.log(data.instance.get_node(data.selected).text);
							});
						}
					});
			/* $
					.ajax({
						type : "POST",
						url : "${pageContext.request.contextPath }/system/priv/ajaxTest",
						data : "",
						dataType : "json",
						success : function(data) {
						console.log(data)
							$('#jstree3').jstree({
							   	"types" : {
									"demo" : {
										"icon" : "${pageContext.request.contextPath}/static/script/jstree/dist/themes/img/tree_icon.png"
									}
								},
								'plugins' : [ "types" ],
								'core' : {
									'data' : data
								}
							});
							// parent.document.getElementById("main_container").height=document.body.offsetHeight; 
						}
					}); */
		/* 	$('#jstree1')
					.jstree(
							{
								'plugins' : [ "wholerow", "checkbox" ],
								'core' : {
									'data' : [
											{
												"text" : "Same but with checkboxes",
												"children" : [
														{
															"text" : "initially selected",
															"state" : {
																"selected" : true
															}
														},
														{
															"text" : "custom icon URL",
															"icon" : "${pageContext.request.contextPath}/static/script/jstree/dist/themes/img/tree_icon.png"
														},
														{
															"text" : "initially open",
															"state" : {
																"opened" : true
															},
															"children" : [ "Another node" ]
														},
														{
															"text" : "custom icon class",
															"icon" : "glyphicon glyphicon-leaf"
														} ]
											}, "And wholerow selection" ]
								}
							}); */
			/* 	$('#jstree2').jstree({
					'plugins' : [ "wholerow", "checkbox" ],
					'core' : {
						'data' : [{"id":"node_1","icon":"","text":"node_test_1","state":{"selected":true,"disabled":false,"opened":true}},{"id":"node_2","icon":"","text":"node_test_2","state":{"selected":true,"disabled":false,"opened":true}},{"id":"node_3","icon":"","text":"node_test_3","state":{"selected":true,"disabled":false,"opened":true}},{"id":"node_4","icon":"","text":"node_test_4","state":{"selected":true,"disabled":false,"opened":true}},{"id":"node_5","icon":"","text":"node_test_5","state":{"selected":true,"disabled":false,"opened":true}},{"id":"node_6","icon":"","text":"node_test_6","state":{"selected":true,"disabled":false,"opened":true}}]  
					}
				}); */

			$('#jstree2').on("changed.jstree", function(e, data) {
			
			});
		});
	</script>
</body>
</html>