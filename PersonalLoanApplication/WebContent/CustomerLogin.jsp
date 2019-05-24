<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
  background-image: url("https://loantap.in/wp-content/uploads/2016/10/blog_personal_overdraft.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}
fieldset {
  border: 3px solid rgb(234,272,65);
  float: center;
  font-size:18px;
  padding:8px;
  width:250px;
  line-height:1.0;}

legend {
   
    
    padding: 3px 6px;
    align: "center";
    font-size:30px;
}


</style>

<title>Login Page</title>
</style>
</head>

<body>
<marquee>
<font color="cyan">
	<ol>
	<h1>Welcome to European Credit Bank</h1>
	</ol>
	</font>
</marquee>
<br>
<br><br><br><br><br><br><br><br>
<fieldset>

<legend>Login </legend>

<form  action="CustomerLoginServlet" method="post">
<font color="indigo">
User Email:<input type="text" placeholder="Enter Email" name="email" required><br><br>
Password:<input type="password" placeholder="Enter Password" name="pass" required><br><br>
<input type="submit" value="Login">
<br><br>
<a href="Forgot.html"><font color="black" size="3">Forgot Password</a>
<h6><font color="cyan" size="5">Don't have an account?</h6>
<a href="CustomerRegister.html"><font color="Yellow" size="3">Register Here</a>
</font>
</form>

</fieldset>



</body>

</html>