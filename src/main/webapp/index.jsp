<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>fly</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link
	href="${pageContext.request.contextPath }/static/style/ui-lightness/jquery-ui-1.9.2.custom.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath }/static/style/login.css"
	rel="stylesheet" type="text/css" />
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

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>


	<div id="header">
		<h1>
			<a href="./dashboard.html">Unicorn Admin</a>
		</h1>
	</div>

	<div id="search">
		<input type="text" placeholder="Search here..." />
		<button type="submit" class="tip-right" title="Search">
			<i class="icon-search icon-white"></i>
		</button>
	</div>
	<div id="user-nav" class="navbar navbar-inverse">
		<ul class="nav btn-group">
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-user"></i> <span class="text">账号设置</span> </a></li>
			<li class="btn btn-inverse dropdown" id="menu-messages"><a
				href="#" data-toggle="dropdown" data-target="#menu-messages"
				class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
					class="text">消息</span> <span class="label label-important">5</span>
					<b class="caret"></b> </a>
				<ul class="dropdown-menu">
					<li><a class="sAdd" title="" href="#">new message</a></li>
					<li><a class="sInbox" title="" href="#">inbox</a></li>
					<li><a class="sOutbox" title="" href="#">outbox</a></li>
					<li><a class="sTrash" title="" href="#">trash</a></li>
				</ul>
			</li>
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-cog"></i> <span class="text">设置</span> </a></li>
			<li class="btn btn-inverse"><a title="" href="login.html"><i
					class="icon icon-share-alt"></i> <span class="text">注销</span> </a></li>
		</ul>
	</div>
	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
			主页</a>
		<ul>
			<li class="active"><a href="index.html"><i
					class="icon icon-home"></i> <span>主页</span> </a></li>
			<c:forEach items="${sessionScope.menuPriv }" var="priv">
				<c:choose>
					<c:when test="${fn:length(priv.subPriv)>0 }">
						<li class="submenu"><a href="#"><i
								class="icon icon-th-list"></i> <span>${priv.privName}</span> <span
								class="label">${fn:length(priv.subPriv)}</span> </a>
							<ul>
								<c:forEach items="${priv.subPriv}" var="subPriv">
									<li><a href="form-common.html">${subPriv.privName }</a></li>
								</c:forEach>
							</ul></li>
					</c:when>
					<c:otherwise>
						<li><a href="buttons.html"><i class="icon icon-tint"></i>
								<span>${priv.privName} &amp; icons</span> </a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</ul>

	</div>

	<div id="style-switcher">
		<i class="icon-arrow-left icon-white"></i> <span>Style:</span> <a
			href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
		<a href="#blue" style="background-color: #2D2F57;"></a> <a href="#red"
			style="background-color: #673232;"></a>
	</div>
	<div id="content">
		<div id="content-header">
			<h1>主页</h1>
			<div class="btn-group">
				<a class="btn btn-large tip-bottom" title="Manage Files"><i
					class="icon-file"></i> </a> <a class="btn btn-large tip-bottom"
					title="Manage Users"><i class="icon-user"></i> </a> <a
					class="btn btn-large tip-bottom" title="Manage Comments"><i
					class="icon-comment"></i><span class="label label-important">5</span>
				</a> <a class="btn btn-large tip-bottom" title="Manage Orders"><i
					class="icon-shopping-cart"></i> </a>
			</div>
		</div>
    <!--  面包屑导航-->
		<div id="breadcrumb">
			<a href="#" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> Home</a> <a href="#" class="current">Dashboard</a>
		</div>
        <div class="container-fluid">
            <div class="row-fluid">
                 <div class="span12 center" style="text-align: center;">
                 </div>
            </div>
			<div class="row-fluid">
				<div id="footer" class="span12">
					2012 &copy; Unicorn Admin. Brought to you by <a
						href="https://wrapbootstrap.com/user/diablo9983">diablo9983</a>
				</div>
			</div>
         </div>
	</div>


	<script
		src="${pageContext.request.contextPath }/static/script/common/jquery-1.8.3.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/common/jquery-ui-1.9.2.custom.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/excanvas.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/script/main/jquery.ui.custom.js"></script>
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
    <script type="text/javascript">
    $(function() {
    //alert('hehe')
    });
    </script>
</body>
</html>