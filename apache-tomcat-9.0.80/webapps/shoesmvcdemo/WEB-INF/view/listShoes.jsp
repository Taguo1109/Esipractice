<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Shoes</title>
</head>
<body>
    <h1>List of Shoes</h1>

    <%-- Display all shoes here --%>
    <c:if test="${not empty shoes}">
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Brand</th>
                    <th>Model</th>
                    <th>Color</th>
                    <th>Price</th>
                    <th>Inventory</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="shoe" items="${shoes}">
                    <tr>
                        <td>${shoe.id}</td>
                        <td>${shoe.brand}</td>
                        <td>${shoe.model}</td>
                        <td>${shoe.color}</td>
                        <td>${shoe.price}</td>
                        <td>${shoe.inventory}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</body>
</html>
