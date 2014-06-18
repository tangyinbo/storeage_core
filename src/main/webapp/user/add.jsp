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
	<div class="container-fluid" style="margin:0;padding:0">
		<div class="row-fluid">
			<div class="span12">
				<div class="widget-box">
					<!-- <div class="widget-title">
						<span class="icon"> <i class="icon-align-justify"></i> </span>
						<h5>Text inputs</h5>
					</div> -->
					<div class="widget-content nopadding">
						<form action="#" method="get" class="form-horizontal" />
						<div class="control-group">
							<label class="control-label">Normal text input</label>
							<div class="controls">
								<input type="text" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">Password input</label>
							<div class="controls">
								<input type="password" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">Input with description</label>
							<div class="controls">
								<input type="text" /> <span class="help-block">This is a
									description</span>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">Input with placeholder</label>
							<div class="controls">
								<input type="text" placeholder="This is a placeholder..." />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">Normal textarea</label>
							<div class="controls">
								<textarea></textarea>
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