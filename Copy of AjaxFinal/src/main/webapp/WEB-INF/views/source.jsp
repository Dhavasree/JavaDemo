<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax</title>

<style type="text/css">
#source
{
 float:left;
   border: 2px solid black;
}  
#destination
{
float:right;
border: 2px solid black;
}
  span.error{
    color: red;
    margin-left: 10px;
  }
</style>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
jQuery(document).ready(function($) {

	$("#button1").submit(function(e) {
		e.preventDefault();
		 $('input').next().remove();
		myFunction();
	}); 
	$("#button2").submit(function(e) {
		e.preventDefault();
		 $('input').next().remove();
		myFunction1();
	});
});
function myFunction() {
	/*  Submit form using Ajax */
		//Prevent default submission of form
		
		$.ajax({
			type:'post',
			url : 'login',
			data : $('form[name=loginForm]').serialize(),
			success : function(response) {
				if(response.validated){
					//Set response
					$('#resultContainer pre code').text(JSON.stringify(response.source));
					$('#resultContainer').show();	
				}else{
					//Set error messages
					$.each(response.errorMessages,function(key,value){
						$('input[name='+key+']').after('<span class="error">'+value+'</span>');
					});
				}
			}
		});
	     
}; 
function myFunction1() {
		$.ajax({
			type:'post',
			url : 'dest',
			data : $('form[name=destForm]').serialize(),
			success : function(response1) {
				if(response1.validated){
					//Set response
					$('#resultContainer1 pre code').text(JSON.stringify(response1.destination));
					alert($('#resultContainer1').show());	
				
				}else{
					//Set error messages
					$.each(response1.errorMessages,function(key,value){
						$('input[name='+key+']').after('<span class="error">'+value+'</span>');
					});}
			}
		})
};
</script> 
</head>
<body>
  <hr />
  <form action="login" method="post" onclick="myFunction()" name="loginForm">
  <div id="source">
    <h1 align="center">Source</h1>
    <table class="table" name="source">
      <tr>
        <td class="text-primary">Driver Name</td>
        <td><input type="text" name="driverName" value="org.h2.Driver"/></td>
      </tr>
      <tr>
        <td class="text-primary">Connection String</td>
        <td><input type="text" name="connectionString" value="jdbc:h2:tcp://localhost/~/test"/></td>
      </tr>
      <tr>
        <td class="text-primary">User name</td>
        <td><input type="text" name="userName" value="sa"/></td>
      </tr>
      <tr>
        <td class="text-primary">password</td>
        <td><input  type="password" name="password" value="sa"/></td>
      </tr>
      <tr>
        <td></td>
        <td><button type="submit" id="button1" class="btn btn-success">Connect</button></td>
      </tr>
    </table>
    <div id="resultContainer" style="display: none;">
 <hr/>
 <h4 style="color: green;">Connected Successfully</h4>
  <pre style="color: green;">
    <code></code>
   </pre>
</div>
    </div>
  </form>
  <form action="dest" method="post" onclick="myFunction1()" name="destForm">
 <!--  For destination -->
<div id="destination">
<h1 align="center">Destination</h1>
    <table class="table" name="destination">
      <tr>
        <td class="text-primary">Driver Name</td>
        <td><input type="text" name="DdriverName" value="org.h2.Driver"/></td>
      </tr>
      <tr>
        <td class="text-primary">Connection String</td>
        <td><input type="text" name="DconnectionString" value="jdbc:h2:tcp://localhost/~/test"/></td>
      </tr>
      <tr>
        <td class="text-primary">User name</td>
        <td><input type="text" name="DuserName" value="sa"/></td>
      </tr>
      <tr>
        <td class="text-primary">password</td>
        <td><input  type="password" name="Dpassword" value="sa"/></td>
      </tr>
      <tr>
        <td></td>
        <td><button type="submit" id="button2" class="btn btn-success">Connect</button></td>
      </tr>
    </table>
     <div id="resultContainer1" style="display: none;">
 <hr/>
 <h4 style="color: green;">Connected Successfully</h4>
  <pre style="color: green;">
    <code></code>
   </pre>
</div>
    </div>
</form>
</body>
</html>