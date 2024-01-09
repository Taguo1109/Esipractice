<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Shoe</title>
</head>
<body>
    <h1>Add Shoe</h1>

    <form action="create" method="post">
        <label for="brand">Brand:</label>
        <input type="text" id="brand" name="brand" required><br>

        <label for="model">Model:</label>
        <input type="text" id="model" name="model" required><br>

        <label for="color">Color:</label>
        <input type="text" id="color" name="color" required><br>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" step="0.01" required><br>

        <label for="inventory">Inventory:</label>
        <input type="number" id="inventory" name="inventory" required><br>

        <button type="submit">Add</button>
    </form>
</body>
</html>
