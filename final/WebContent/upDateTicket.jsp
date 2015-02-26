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
	
<s:form action="upDateTicket">
<s:iterator value="ticketList" var="people">
		<s:textfield name="ticket_id" label="Ticket Id" readonly="true"></s:textfield>
		<s:set var="df"
			value="%{new java.text.SimpleDateFormat('dd/MM/yyyy')}"  />
		<s:textfield name="date1" label="Open Date"
			value="%{#df.format(new java.util.Date())}" readonly="true"/>
			
		<s:textfield name="name" label="Customer name" readonly="true"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:select label="Department" 
			headerValue="Select Department"
			list="#{'sales':'Sales Dept', 'service':'Service Dept', 'marketing':'Marketing Dept', 'legal':'Legal Dept'}"
			name="department" />
		
		<s:textfield name="summery" label="Issue Summery" readonly="true"></s:textfield>
		<s:textarea name="description" label="Issue discription" readonly="true"></s:textarea>
		 <s:textfield label="Issue Type" name="issueType2"></s:textfield>
		  <s:textfield label="Issue detail" name="issueType"></s:textfield>
        
        
		
		<s:select label="Category"
			list="#{'cat1':'Category 1', 'cat2':'Category 2', 'cat3':'Category 3', 'cat4':'Category 4'}"
			name="category" />

		<s:select label="Impact"
			list="#{'low':'Low', 'medium':'Medium', 'high':'High', 'critical':'Critical'}"
			name="impact" />
		<s:select label="Contact method"
			list="#{'email':'Email', 'phone':'Phone', 'walkin':'Walk in', 'other':'Other'}"
			name="contactMethod" readonly="true"/>



		<s:textfield name="assigneName" label="Assignee"></s:textfield>
		<s:textfield name="status" label="Status"></s:textfield>
		<s:select label="ticket status"
			list="#{'assigned':'Assigned', 'closed':'Closed', 'pending':'Pending', 'on hold':'On hold'}"
			name="Department" />
		<s:textarea name="statusupdate" label="Status update"></s:textarea>
		<s:textarea name="resolution" label="Resolution"></s:textarea>


		<s:submit value="Submit"></s:submit>
		</s:iterator>
	</s:form>
	

	<div></div>

</body>
</html>