<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid black;
	}
</style>
</head>
<div class="ex">
<body>
<h1>Registration Form</h1>
<form action="view" method="POST">
Enter name:
<input type="text" name="name" class="form-control input-lg" id="inputlg"/><br>
Enter Email Id:
<input type="text" name="email" class="form-control input-lg" id="inputlg" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"/><br>
Enter Phone Number:
<input type="text" name="num" class="form-control input-lg" id="inputlg" pattern="[0-9]{10}"/><br>
Gender:
<input type="radio" name="gender" value="male"/>male
<input type="radio" name="gender" value="female"/>female<br>

<input type="submit" value="submit" class="btn btn-lg btn-info collapsed"/>
</form>
</body>
</html>