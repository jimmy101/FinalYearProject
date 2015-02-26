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
	<title>Ticket</title>
</body>
<head></head>
<body>
	
	<h1>
		<p align="center">Ticket</p>
	</h1>


	<p align="Left">Complete ticket</p>
<s:form action="createTicket">

		<s:set var="df"
			value="%{new java.text.SimpleDateFormat('dd/MM/yyyy')}" />
		<s:textfield name="date1" label="Date"
			value="%{#df.format(new java.util.Date())}" />
		<s:textfield name="name" label="Customer name"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:select label="Department" 
			headerValue="Select Department"
			list="#{'sales':'Sales Dept', 'service':'Service Dept', 'marketing':'Marketing Dept', 'legal':'Legal Dept'}"
			name="department" />
		
		<s:textfield name="summery" label="Issue Summery"></s:textfield>
		<s:textarea name="description" label="Issue discription"></s:textarea>
		 <s:doubleselect label="Issue Type" name="issueType"
         list="{'Software','Hardware'}" doubleName="issueType2"
         doubleList="top == 'Software' ? 
         {'Windows7', 'Office 2010','Adobe','Eclipse','Word','Excell','Access','Internet Explorer'} : {'Monitor','Keyboard','Mouse','Laptop','Diskdrive','Printer','Phone'}" />
		
		<s:select label="Category"
			list="#{'cat1':'Category 1', 'cat2':'Category 2', 'cat3':'Category 3', 'cat4':'Category 4'}"
			name="category" />

		<s:select label="Impact"
			list="#{'low':'Low', 'medium':'Medium', 'high':'High', 'critical':'Critical'}"
			name="impact" />
		<s:select label="Contact method"
			list="#{'email':'Email', 'phone':'Phone', 'walkin':'Walk in', 'other':'Other'}"
			name="contactMethod" />



		<s:textfield name="assigneName" label="Assignee"></s:textfield>
		
		<s:select label="ticket status"
			list="#{'assigned':'Assigned', 'closed':'Closed', 'pending':'Pending', 'on hold':'On hold'}"
			name="status" />
		<s:textarea name="statusupdate" label="Status update"></s:textarea>
		<s:textarea name="resolution" label="Resolution"></s:textarea>


		<s:submit value="Submit"></s:submit>
	</s:form>


	<div></div>

</body>
</html>