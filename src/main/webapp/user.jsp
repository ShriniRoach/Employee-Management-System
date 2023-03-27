<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/user.css">
    <title>Employee Management System</title>
</head>
<body>
    <div class="title">
        <h1>EMPLOYEE MANAGEMENT SYSTEM</h1>
    </div>
    <div class="main">
    <div class="login">
        <h2>Login</h2>
        <form action="user">
            <input class="input" type="text" name="username" placeholder="Enter username"><br>
            <h3>${name}</h3>
            <input class="input" type="password" name="password" placeholder="Enter password"><br>
            <h3>${pwd}</h3>
            <input class="submit" type="submit" value="Login">
        </form>
    </div>
</div>
</body>
</html>