<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="css/bootstrap.css" rel="stylesheet" media="screen">
</head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>create ticket</title>
</head>
<body bgcolor = "#E6E6FA">
<h1> Search for a ticket</h1>

<p align = "Left"> Enter Details </p>

<s:form action="findTicket">  
<s:textfield name="name" label="Client Name"></s:textfield> 
 
<  
<s:textfield name="email" label="Client Email"></s:textfield>
<s:submit value="Search"></s:submit>
</s:form>
<s:form action="findTicket">
<s:textfield name="department" label="Client Dept"></s:textfield>
<s:submit value="Search"></s:submit>
</s:form>
<s:form action="findTicket">  
<s:textfield name="date1" label="Date Created"></s:textfield> 
<s:submit value="Search"></s:submit>
</s:form>
<s:form action="findTicket">  
<s:textfield name="assigneName" label="Assignee"></s:textfield> 
<s:submit value="Search"></s:submit>
</s:form>
<s:form action="findTicket">  
<s:textfield name="issueType" label="Issue"></s:textfield> 
<s:submit value="Search 23"></s:submit>
</s:form>

<s:form action="findTicket">  
<s:textfield name="ticket_id" label="Ticket ID"></s:textfield> 
<s:submit value="Update ticket"></s:submit>
</s:form> 



</body>
</html>