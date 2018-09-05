<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="ex" align="center">
<form action="added">
<table >
<tr><td>Name</td>
<td><input type="text" name="username"/></td>
</tr>
<tr><td>Id</td>
<td><input type="text" name="id" pattern="[0-9]{2,}"/></td>
</tr>
<tr><td>Location</td>
<td><input type="text" name="location" /></td>
</tr>
</table>
<input type="submit" value="submit"/>
</form>
</div>
</body>
</html>