<%--
  Created by IntelliJ IDEA.
  User: Phan Van Tho
  Date: 6/1/2023
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Checkout</title>
    <style>
        /* CSS code */
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        img {
            max-width: 100px;
            height: auto;
        }

        a {
            color: #007bff;
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Danh sach cac san phan</h1>
    <table>
        <tr>
            <th>Tên sản phẩm</th>
            <th>Hình ảnh</th>
            <th>Giá</th>
            <th>Action</th>
        </tr>
        <c:forEach var="item" items="${sessionProduct}">
            <tr>
                <td>${item.name}</td>
                <td>
                    <img src="${item.image}">
                </td>
                <td>${item.price}</td>
                <td><a href="DeleteProduct?id=${item.id}">Xóa</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
