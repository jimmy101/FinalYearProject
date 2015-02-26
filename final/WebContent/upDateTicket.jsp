<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet" media="screen">


</head>

<body></body>
<head></head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body bgcolor="#E6E6FA">
	<title>Edit Ticket</title>
</body>
<head></head>
<body>
<h1>
		<p align="center">Update Ticket</p>
	</h1>

	<s:form action="updateTicket">
	<s:iterator value="ticketList" var="people">
	<s:textfield name="ticket_id" label="Ticket id " readonly="true"></s:textfield>
	<s:textfield name="name" label="Client name " readonly="true"></s:textfield>	
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="department" label="department "></s:textfield>
		<s:textfield name="summery" label="Summery" readonly="true"></s:textfield>
		<s:textfield name="description" label="Description" readonly="true"></s:textfield>
		<s:textfield name="issueType" label="issueType 1"></s:textfield>
		<s:textfield name="issueType2" label="issueType" readonly="true"></s:textfield>
		<s:textfield name="category" label="Category"></s:textfield>
		<s:textfield name="impact" label="Impact" readonly="true"></s:textfield>
		<s:textfield name="contactMethod" label="Contact Method" readonly="true"></s:textfield>
		<s:textfield name="assigneName" label="Assignee "></s:textfield>
		<s:textfield name="status" label="Status"></s:textfield>
		<s:textfield name="statusupdate" label="Status update"></s:textfield>
		<s:textfield name="resolution" label="Resolution "></s:textfield>
		
		
		<s:submit value="Submit now22"></s:submit>
		</s:iterator>
	</s:form>

	

	
</body>
</html>