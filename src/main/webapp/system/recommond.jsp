<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="page" uri="/WEB-INF/taglib/pagination.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/bootstrap-responsive.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/fullcalendar.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/unicorn.main.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/unicorn.grey.css"
	class="skin-color" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/common.css" />
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/uniform.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/style/main/select2.css" /> --%>
<style type="text/css">
* {
	margin: 0;
	padding: 0
}
</style>
</head>
<body>
	<script type="text/javascript">
		//iframe 自适应高度
		function SetWinHeight(obj) {
			var win = obj;
			if (document.getElementById) {
				if (win && !window.opera) {
					if (win.contentDocument
							&& win.contentDocument.body.offsetHeight) {
						win.height = win.contentDocument.body.offsetHeight;
					} else if (win.Document && win.Document.body.scrollHeight)
						win.height = win.Document.body.scrollHeight;
				}
			}
		}
	</script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/excanvas.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/common/jquery-1.8.3.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/common/jquery-ui-1.9.2.custom.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/jquery.flot.resize.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/jquery.peity.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/fullcalendar.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/unicorn.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/unicorn.dashboard.js"></script>
	<%-- <script src="${pageContext.request.contextPath }/static/script/main/jquery.uniform.js"></script>
	<script src="${pageContext.request.contextPath }/static/script/main/select2.min.js"></script>
	<script src="${pageContext.request.contextPath }/static/script/main/jquery.dataTables.min.js"></script>
	<script src="${pageContext.request.contextPath }/static/script/main/unicorn.tables.js"></script> --%>

</body>
</html>