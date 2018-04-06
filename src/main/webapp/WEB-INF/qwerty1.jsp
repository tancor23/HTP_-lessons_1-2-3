<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User main page</title>
</head>
<body>
	<p>Hello User!</p>
	<h2>Car List</h2>
	<table border="1" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>Brand</th>
			<th>Model</th>
		</tr>
		<c:forEach items="${carlist}" var="car">
		<tr>
			<td>${car.id}</td>
			<td>${car.brand}</td>
			<td>${car.model}</td>
		</tr>
		</c:forEach>
	</table>	
</body>
</html>