<%--
  Created by IntelliJ IDEA.
  User: Phan Van Tho
  Date: 6/1/2023
  Time: 1:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Thêm người dùng</title>
  <style>
    form {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
      border: 1px solid #ccc;
      border-radius: 5px;
      background-color: #f7f7f7;
      font-family: Arial, sans-serif;
    }

    input[type="text"],
    input[type="password"],
    input[type="email"],
    select {
      width: 100%;
      padding: 10px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
      font-size: 14px;
    }

    input[type="radio"] {
      margin-right: 5px;
    }

    button {
      padding: 10px 20px;
      margin-top: 10px;
      border: none;
      border-radius: 5px;
      background-color: #4CAF50;
      color: white;
      font-size: 16px;
      cursor: pointer;
    }

    button[type="reset"] {
      background-color: #f44336;
    }

    button[type="submit"]:hover,
    button[type="reset"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>

<form action="UpdateUser" method="post">
  <h1>Cập nhật người dùng</h1><br/>
  <input type="hidden" name="id" value="${user.id}">
  Name: <input type="text" name="name" value="${user.name}"/><br/>
  Password: <input type="password" name="password" value="${user.password}"/><br/>
  Email: <input type="email" name="email" value="${user.email}"/><br/>
  Giới tính:
  <input type="radio" name="sex" value="Male" checked/>Nam
  <input type="radio" name="sex" value="Female"/>Nữ<br/>
  Country:
  <select name="country">
    <option>Việt Nam</option>
    <option selected>Lào</option>
    <option>Campuchia</option>
  </select><br/>
  <button type="submit">Cập nhật</button>
  <button type="reset">Reset</button>
  <a href="SelectUser">View User List</a>
</form>
</body>
</html>
