<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <link href="C:/Users/it.admin/Downloads/bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/scripts/jquery.min.js"></script>
   <script src="C:/Users/it.admin/Downloads/bootstrap/bootstrap/js/bootstrap.min.js"></script>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body bgcolor = "#E6E6FA">
<title>forgotusername/password</title>
</head>
<body>
<h1><p align = "center">Register New User</h1></p>


<s:form action="register">  
<s:textfield name="name" label="Name"></s:textfield> 
<s:textfield name="email" label="Email"></s:textfield>  
<s:textfield name="userName" label="UserName"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:submit value="Register"></s:submit>
</s:form>




Click <a href="admin.jsp">here</a> Return to Homepage.


</body>
</html>