<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shoe Search</title>
</head>
<body>
    <h1>Shoe Search</h1>
    
    <form action="search" method="get">
        <label for="brand">Brand:</label>
        <input type="text" id="brand" name="brand" >
        <button type="submit">Search</button>
    </form>

    <c:if test="${not empty shoes}">
        <h2>Search Results:</h2>
        <ul>
            <c:forEach var="shoe" items="${shoes}">
                <li>${shoe.brand} - ${shoe.model} - ${shoe.color}</li>
            </c:forEach>
        </ul>
    </c:if>
</body>
</html>
