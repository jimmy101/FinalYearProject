<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<html>
<head>
<script src="jquery-2.1.1.js" language="javascript"></script>
<!--<link href="css/bootstrap.css" rel="stylesheet" media="screen">-->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<title>Successful Login</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("button").click(function(){
        $("#contact").hide();
    });
});

</script>
<script>
$(document).ready(function() {
    $('#contact').dataTable( {
        "scrollX": true
    } );
} );
</script>
<script type="text/javascript">
$('#contact').on('click', 'tr', function() {
	   var row = $(this).find('td:first').text();
	   alert('You clicked ' + row);
	});

</script>
<script >


</script>
</head>
<body bgcolor = "#E6E6FA">




	<table class="table table-stripec" "id="contact" border= data-height="100">
		 <thead>
			<tr>
				<th>Ticket Id</th>
				<th>Creation Date</th>
				<th>Client Name</th>
				<th>Issue Dept.</th>
				<th>Summery.</th>
				<th>Status.</th>
		</tr></p>
		</table>
		
	<div style="height: 150px; overflow: auto;">
		<p id="contact"><table class="table table-stripec" "id="contact" border= data-height="100">
		 <thead>
			<tr>
				<th>Ticket Id</th>
				<th>Creation Date</th>
				<th>Client Name</th>
				<th>Issue Dept.</th>
				<th>Summery.</th>
				<th>Status.</th>
		</tr></p>

			<s:iterator value="ticketList">
				<tr>
				
					<td><s:property value="ticket_id" /></td>
					<td><s:property value="date1" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="department" /></td>
					<td><s:property value="summery" /></td>
					<td><s:property value="status" /></td>
					

				</tr>
				</s:iterator>
				
				
			
			 </thead>
		</table>
		</div>

	HELLO <s:property value="name"/>
			<s:property value="email"/>

<s:form action="findTicket">  
<s:textfield name="ticket_id" label="Ticket ID"></s:textfield> 
 
<s:submit value="enter ticket number"></s:submit>
</s:form> 

<div>

	<s:form action="launchBlankTicket">
		<s:submit value="Create Ticket"></s:submit>
	</s:form>

	<s:form action="searchticket">
		<s:submit value="Search ticketsts"></s:submit>
	</s:form>
	
	<s:form action="editTicket">
	<s:textfield name="ticket_id" label="Ticket ID"></s:textfield> 
		<s:submit value="Update Ticket"></s:submit>
	</s:form>

</div>

</body>
</html>