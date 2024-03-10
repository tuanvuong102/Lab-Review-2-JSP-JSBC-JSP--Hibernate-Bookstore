<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Publisher</title>
</head>
<body>
    <h2>List of Publisher</h2>
    <table border="1">
        <tr>
            <th>Publisher ID</th>
            <th>Publisher Name</th>
            <th>Phone</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${publisherList}" var ="publisher">
            <tr>
                <td>${publisher.publisherId}</td>
                <td>${publisher.publisherName}</td>
                <td>${publisher.phone}</td>
                <td>${publisher.address}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
