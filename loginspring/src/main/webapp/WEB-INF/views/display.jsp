<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.btn {
  border: 2px solid black;
  background-color: white;
  color: black;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
}
.success {
  border-color: #4CAF50;
  color: green;
}
.success:hover {
  background-color: #4CAF50;
  color: white;
}
div.ex {
	text-align: right width:300px;
	padding: 50px;
	border: 5px solid red;
	}
</style>
</head>
<body>
<div class="ex">
<h1>Registered Details</h1>
Name: ${name}<br>
Email:${email}<br>
Gender:${gender}<br>
Phone number: ${num}<br><br>
<a href="logout" class="btn success">Logout</a>
</body>
</html>