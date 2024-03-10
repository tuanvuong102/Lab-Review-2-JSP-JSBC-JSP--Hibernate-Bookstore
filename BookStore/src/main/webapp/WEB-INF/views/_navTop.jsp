<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
    * {
        margin: 0;
        padding: 0;
    }

    nav {
        background-color: #3578E5;
    }

    nav ul {
        display: flex;
        justify-content: flex-start;
        align-items: center;
        list-style: none;
    }

    nav ul li a {
        color: #fff;
        display: block;
        padding: 1rem;
        text-decoration: none;
    }

    nav ul li first-child a {
        padding-left: 0 !important;
    }

    nav ul li a:hover {
        color: yellow;
    }

    /* Style cho dropdown menu */
    .dropdown {
        position: relative;
        display: inline-block;
    }

    .dropdown-content {
        display: none;
        position: absolute;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 1;
    }

    .dropdown-content a {
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
    }

    .dropdown-content a:hover {
        background-color: #f1f1f1;
    }

    .dropdown:hover .dropdown-content {
        display: block;
    }
</style>
<nav>
    <ul class="container">
        <li class="dropdown">
		<a href="${pageContext.request.contextPath}/bookList">Book List</a>
            <div class="dropdown-content">
                <a href="${pageContext.request.contextPath}/addBook">Thêm</a>
                <a href="#">Sửa</a>
                <a href="#">Xóa</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="${pageContext.request.contextPath}/categoryList">Category List</a>
            <div class="dropdown-content">
                <a href="${pageContext.request.contextPath}/addCategory">Thêm</a>
                <a href="#">Sửa</a>
                <a href="#">Xóa</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="${pageContext.request.contextPath}/publisherList">Publisher List</a>
            <div class="dropdown-content">
                <a href="${pageContext.request.contextPath}/addPublisher">Thêm</a>
                <a href="#">Sửa</a>
                <a href="#">Xóa</a>
            </div>
        </li>
    </ul>
</nav>
