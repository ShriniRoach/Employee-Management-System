<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Employee Management System</title>
</head>
<body>
	<section class="content">
		<div class="list">
			<h1>List of employees</h1>
			<form action="addemp.jsp">
				<button class="add">Add employee</button>
			</form>
			<table border="1">
				<tr>
					<th width="40">ID</th>
                    <th width="150">Name</th>
                    <th width="130">Mobile</th>
                    <th width="200">Email</th>
                    <th width="200">Designation</th>
                    <th width="100">Gender</th>
                    <th width="150">Address</th>
                    <th width="100">Salary</th>
                    <th width="150">Action</th>
				</tr>
				<c:forEach var="f" items="${list}">
					<tr>
						<td>${f.eid}</td>
						<td>${f.name}</td>
						<td>${f.mobile}</td>
						<td>${f.emailID}</td>
						<td>${f.job}</td>
						<td>${f.gender}</td>
						<td>${f.address}</td>
						<td>${f.salary}</td>
						<td>
							<div class="action"> 
								<form action="edits">
									<input type="hidden" name="eid" value="${f.eid}"> <input
										class="edit" type="submit" value="Edit">
								</form>
								<form action="deleteemp">
									<input type="hidden" name="eid" value="${f.eid}"> <input
										class="remove" type="submit" value="Remove">
								</form>
							</div>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			<h1>Find employee</h1>
			<form action="getemp">
				<input class="find" type="number" name="eid" placeholder="Enter employee ID">
				<input class="sub" type="submit" value="Find">
			</form>
			<h1 class="notfound">${notfound}</h1>
			<table border="1">
				<tr>
					<th width="40">ID</th>
                	<th width="150">Name</th>
                	<th width="130">Mobile</th>
                	<th width="200">Email</th>
                	<th width="200">Designation</th>
                	<th width="100">Gender</th>
                	<th width="150">Address</th>
              		<th width="100">Salary</th>
                	<th width="150">Action</th>
				</tr>
				<tr>
					<td>${eid}</td>
					<td>${name}</td>
					<td>${mobile}</td>
					<td>${email}</td>
					<td>${job}</td>
					<td>${gender}</td>
					<td>${address}</td>
					<td>${salary}</td>
					<td>
						<div class="action">
							<form action="edits">
								<input type="hidden" name="eid" value="${eid}"> 
								<input class="edit" type="submit" value="Edit">
							</form>
							<form action="deleteemp">
								<input type="hidden" name="eid" value="${eid}"> 
								<input class="remove" type="submit" value="Remove">
							</form>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</section>
</body>
</html>