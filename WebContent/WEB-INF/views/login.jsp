<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Login</title>
   </head>
   <body>
     <jsp:include page="./decorator/header.jsp"></jsp:include>
     <jsp:include page="./decorator/menu.jsp"></jsp:include>
 
      <h3>Login</h3>
      <p style="color: red;">${errorString}</p>
 
	<form action="j_security_check" method=post>
		<table border="0">
			<tr>
				<td>Username</td>
				<td> <input type="text" name="j_username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
 
<jsp:include page="./decorator/footer.jsp"></jsp:include>
   </body>
</html>