<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "#E6E6FA">


<s:form action="findTicket">  
<s:textfield name="ticket_id" label="Ticket ID"></s:textfield> 
<s:submit value="Search"></s:submit>
</s:form> 

<div>

	<s:form action="launchBlankTicket">
		<s:submit value="Create Ticket"></s:submit>
	</s:form>

	<s:form action="searchticket">
		<s:submit value="Search ticketst"></s:submit>
	</s:form>
	
	<s:form action="registerUser">
		<s:submit value="Register user"></s:submit>
	</s:form>

</body>
</html>