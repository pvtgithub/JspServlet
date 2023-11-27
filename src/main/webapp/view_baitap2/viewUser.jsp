<%--
  Created by IntelliJ IDEA.
  User: Phan Van Tho
  Date: 6/1/2023
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        div {
            margin: 20px;
            padding: 20px;
            background-color: #f0f0f0;
            border-radius: 5px;
        }

        h1 {
            font-size: 24px;
            color: #333;
            margin-bottom: 10px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th {
            background-color: #f5f5f5;
            color: #333;
            padding: 8px;
            font-weight: bold;
            text-align: left;
        }

        td {
            padding: 8px;
            border-bottom: 1px solid #ccc;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:nth-child(odd) {
            background-color: #fff;
        }
    </style>
</head>
<body>
<div>
    <h1>Danh sách User</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Password</th>
            <th>Email</th>
            <th>Giới tính</th>
            <th>Country</th>
            <th>Acction</th>
        </tr>
        <c:forEach var="item" items="${listUser}">
            <tr>
                <td>${item.id}</td>
                <td>${item.name} </td>
                <td> ${item.password}</td>
                <td>${item.email} </td>
                <td> ${item.sex}</td>
                <td> ${item.country}</td>
                <td><a href="DeleteUser?id=${item.getId()}">Xóa</a></td>
                <td><a href="UpdateUser?id=${item.getId()}">Edit</a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="AddUser">Add User</a>
</div>
</body>
</html>
