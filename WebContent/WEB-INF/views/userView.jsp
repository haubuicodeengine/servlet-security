<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>User Info</title>
 </head>
 <body>
 
     <jsp:include page="./decorator/header.jsp"></jsp:include>
     <jsp:include page="./decorator/menu.jsp"></jsp:include>
 
    <h3>Hello: ${user.userName}</h3>
 
    User Name: <b>${user.userName}</b>
    <br />
    Gender: ${user.gender } <br />
 
    <jsp:include page="./decorator/footer.jsp"></jsp:include>
 
 </body>
</html>