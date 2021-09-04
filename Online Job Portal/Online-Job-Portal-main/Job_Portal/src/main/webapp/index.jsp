<%@ page import="com.DB.DBConnect" %>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
<%@include file="all_component/css.jsp"%>
<style type="text/css">
.back-img {
	background: url("image/index1.jpg");
	width: 100%;
	height: 85vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>

	<div class="container-fluid back-img">
		<div class="text-center">
			<h1 class="text-black p-4">
				<i class="fa fa-book" aria-hidden="true"></i> Online Job Portal
			</h1>
		</div>
	</div>
	<%@include file="all_component/footer.jsp"%>
</body>
</html>