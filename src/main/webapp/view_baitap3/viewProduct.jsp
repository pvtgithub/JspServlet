<%--
  Created by IntelliJ IDEA.
  User: Phan Van Tho
  Date: 6/1/2023
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sản phầm</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #333;
            text-align: center;
        }

        div {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin-bottom: 20px;
        }

        img {
            height: 250px;
            width: 250px;
            border-radius: 5px;
            margin-bottom: 10px;
        }

        p {
            margin: 0;
        }

        .product-name {
            font-weight: bold;
            font-size: 16px;
            margin-bottom: 5px;
        }

        .product-price {
            color: #888;
            font-size: 14px;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
        }
    </style>
</head>
<body>
<h1>Danh sách sản phẩm</h1>

<div class="container">
    <c:forEach var="item" items="${listProduct}">
        <div>
            <img src="${item.image}"/>
            <p class="product-name">${item.name}</p>
            <p class="product-price">${item.price}</p>
            <a href="AddCart?id=${item.id}&name=${item.name}&image=${item.image}&price=${item.price}">Them vao gio
                hang</a>
        </div>
    </c:forEach>
</div>
<div>
    <h3>Giỏ hàng</h3>
    <c:forEach var="item" items="${sessionProduct}">
        <p>${item.name}</p>
    </c:forEach>
    <a href="CheckOutProduct">Check Out</a>
</div>
</body>
</html>
