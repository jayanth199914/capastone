<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="loginRegister" method= "post">
<table style="background-color: skyblue; margin-left :20px ; margin-left: 20px;">
<tr>
<td><h3 style="color: red;">${message}</h3></td>
<h3 style="color: green;">${successMessage }</h3>
<td></td>
</tr>
<tr>
<td><h3 style="color: red";>login page</h3></td>
<td></td>
</tr>
<tr><td> UserName: </td><td><input type="text" name="username"></td></tr>
<tr><td> Password: </td><td><input type="password" name="password1"></td></tr>
<tr><td></td><td><input type="submit" name="submit" value ="login"></td><a href="register.jsp">Registration</a></tr>
</table>
</form>
</body>
</html>