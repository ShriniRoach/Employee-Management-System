<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/addupstyle.css">
    <title>Edit employee</title>
</head>
<body>
    <div class="content">
        <h1>Edit employee details</h1>
        <form class="addemp" action="update">
            <input class="form" type="text" name="name" value="${ename}">
            <input class="form" type="number" name="mobile" value="${emobile}">
            <input class="form" type="text" name="emailID" value="${eemail}">
            <select class="select" name="job">
                <option value="">Select designation</option>
                <option value="Java Developer">Java Developer</option>
                <option value="SQL Developer">SQL Developer</option>
                <option value="Python Developer">Python Developer</option>
                <option value="Web Developer">Web Developer</option>
            </select><br>
            <select class="select" name="gender">
                <option value="">Select gender</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>
            <input class="form" type="text" name="address" value="${eaddress}">
            <input class="form" type="number" name="salary" value="${esalary}"><br>
            <input class="addsubmit" type="submit">
        </form>
    </div>
</body>
</html>