<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Category</title>
</head>
<body>
    <h2>List of Category</h2>
    <table border="1">
        <tr>
            <th>Category ID</th>
            <th>Category Name</th>
        </tr>
        <c:forEach items="${categoryList}" var ="category">
            <tr>
                <td>${category.categoryId}</td>
                <td>${category.categoryName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
