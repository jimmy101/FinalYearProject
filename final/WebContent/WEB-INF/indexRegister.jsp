<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link href="css/bootstrap.css" rel="stylesheet"media="screen">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body bgcolor = "#E6E6FA">
<title>Registration</title>
</head>
<body>
<h1><p align = "center">Help desk user Register form</h1>

<p align = "Left"> Register, to become a member </p>
<s:form action="register">  
<s:textfield name="name" label="Name"></s:textfield>   
<s:textfield name="email" label="Email"></s:textfield>  
<s:textfield name="userName" label="UserName"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:submit value="Register"></s:submit>
</s:form>
<s:form action="list">
<s:submit value="list"></s:submit>
</s:form>

</body>
</html>