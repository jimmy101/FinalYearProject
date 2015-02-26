<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="css/bootstrap.css" rel="stylesheet"media="screen">
 <body  bgcolor ="#E6E6FA">
<title>Login</title>
</head>
<body bgcolor = "#E6E6FA" >

<div class="container">
<div class="row" id ="main-content">
<div class="span6" id="sidebar">
<div class="well">

   <form action="loginaction" method="post" >
   <legend>Login</legend>
      User:<br/><input type="text" name="userName"/><br/>
      Password:<br/><input type="text" name="password"/><br/>
      <input type="submit" value="Login"/>		
   </form>
 
</body>
</html>