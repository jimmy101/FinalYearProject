<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home PAge</title>
</head>
<body  bgcolor = "#E6E6FA">

<h1>Pleas make a Choice</h1>

<s:form action="launchBlankTicket">
		<s:submit value="Create Ticket"></s:submit>
	</s:form>

	<s:form action="searchticket">
		<s:submit value="Search ticketsts"></s:submit>
	</s:form>
	
	<s:form action="editTicket">
	 
		<s:submit value="Update Ticket"></s:submit>
	</s:form>

</body>
</html>