<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:set var="counter" value="0"/>
<h1>Stats page</h1>
	
	<h3>there are <s:property  value="ticketList.size"/>  tickets in the database</h3>
	<h3>there are <s:property  value="ticketList1.size"/>  tickets in the  software category</h3>
	<h3>there are <s:property  value="ticketList2.size"/>  tickets open for the Legal department</h3>
	<h3>there are <s:property  value="ticketList3.size"/>  tickets open for the Sales department</h3>
	<h3>there are <s:property  value="intList.size"/>  tickets closed for Mary intlist</h3>
	<h3>there are <s:property  value="intList[#counter].size"/>  tickets closed for Mary intlist</h3>
	
	<h3>there are <s:property  value="intList[#counter+1][#counter].name"/>  tickets closed for Mary intlist</h3>
	
	
</body>
</html>