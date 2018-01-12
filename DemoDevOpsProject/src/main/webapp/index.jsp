<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DevOps First Demo</title>
<script src="js/angular/angular.min.js"></script>
</head>
<body>
 <form action="${pageContext.request.contextPath}/myservlet" method="post">
         Input 1: <input type = "text" id = "input_1" name = "input_1" value="${a}"/>
         <br />
         Input 2: <input type = "text" id = "input_2" name = "input_2" value="${b}"/>
         <br /> <br />
         Output  : <input type = "text" id = "output" name = "output" onkeydown="event.preventDefault()" value="${result}"  readonly/>
         <br /><br />
         <input type = "submit" name = "Addition" value = "Addition"/>
         <input type = "submit" name = "Subtraction" value = "Subtraction" />
         <input type = "submit" name = "Multiplication" value = "Multiplication" />
         <input type = "submit" name = "Division" value = "Division" />
 </form>
      
     
</body>
</html>