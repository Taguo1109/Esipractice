<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>員工層次結構查詢</title>
</head>
<body>
    <h1>員工層次結構查詢</h1>
    <form action="hierarchy" method="get">
        <label for="employeeId">員工編號:</label>
        <input type="text" id="employeeId" name="employeeId">
        <button type="submit">查詢</button>
    </form>

    <c:if test="${not empty employeeHierarchy}">
        <h2>員工層次結構：</h2>
        <table border="1">
            <thead>
                <tr>
                    <th>員工編號</th>
                    <th>名字</th>
                    <th>姓氏</th>
                    <th>Reports To</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="employee" items="${employeeHierarchy}">
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

    <c:if test="${empty employeeHierarchy and not empty param.employeeId}">
        <p>查無此員工或該員工無層次結構資訊。</p>
    </c:if>
</body>
</html>
