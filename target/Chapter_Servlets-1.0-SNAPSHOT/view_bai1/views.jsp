<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Bánh Ngọt</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f1f1f1;
        }

        h1 {
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ccc;
        }

        img {
            max-width: 100px;
            max-height: 100px;
        }

        a {
            display: inline-block;
            padding: 5px 10px;
            background-color: #337ab7;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }

        ul {
            list-style-type: disc;
            margin: 10px 0;
            padding-left: 20px;
        }

        li {
            margin-bottom: 5px;
        }

        div {
            margin-top: 20px;
        }

        a.checkout-btn {
            background-color: #5cb85c;
        }
    </style>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Tên sản phẩm</th>
        <th>Hình ảnh</th>
        <th>Giá</th>
        <th>Action</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td><img src="${product.image}"></td>
            <td>${product.price}</td>
            <td>
                <a href="AddProduct?id=${product.id}&name=${product.name}&image=${product.image}&price=${product.price}">Thêm
                    vào giỏ hàng</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h1>Giỏ hàng</h1>
<div>
    <ul style="list-style-type: -moz-ethiopic-numeric">
        <c:forEach var="product" items="${listSession}">
            <li>${product.name} + ${product.price} </li>
        </c:forEach>
    </ul>
    <a href="CheckoutSevrlet">Checkout</a>
</div>
</body>
</html>
