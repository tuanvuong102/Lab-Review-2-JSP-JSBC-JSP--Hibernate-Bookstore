<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Books</title>
</head>
<body>
    <h2>List of Books</h2>
    <table border="1">
        <tr>
            <th>Book ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Release Year</th>
            <th>Price</th>
            <th>Picture</th>
            <th>Publisher ID</th>
            <th>Category ID</th>
        </tr>
        <c:forEach items="${bookList}" var ="book">
            <tr>
                <td>${book.bookId}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.release}</td>
                <td>${book.price}</td>
                <td>${book.picture}</td>
                <td>${book.publisherId}</td>
                <td>${book.categoryId}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
