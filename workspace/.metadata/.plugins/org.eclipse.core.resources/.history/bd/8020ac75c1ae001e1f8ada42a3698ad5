<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>員工查詢</title>
</head>
<body>
	<h1>員工查詢</h1>
	<form action="search" method="get">
		<label for="brand">員工編號:</label> 
		<input type="text" id="id"
			name="id">
		<button type="submit">搜尋</button>
	</form>

	<c:if test="${not empty employees}">
		<h2>搜尋結果：</h2>
		<table border ="1">
		<thead>
			<tr>
			<th>empid</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>reports to</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstname}</td>
				<td>${employee.lastname}</td>
				<td>${employee.reportsto}</td>
			</tr>
		</c:forEach>
		</tbody>
		</table>
	</c:if>
	<c:if test="${empty employees}">
		<p>查無此員工</p>
	</c:if>
</body>
</html>