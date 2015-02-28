<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
   
<%@ taglib prefix="sjc" uri="/struts-jquery-chart-tags"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home PAge</title>
</head>
<body  bgcolor = "#E6E6FA">

<h1>Pleas make a Choice</h1>


<script type="text/javascript">
        $.subscribe('chartHover', function(event, data) {
    $("#topicsHover").text(event.originalEvent.pos.x.toFixed(2)+','+event.originalEvent.pos.y.toFixed(2));
        });
        $.subscribe('chartClick', function(event, data) {
                var item = event.originalEvent.item;
    if (item) {
      $("#topicsClick").text("You clicked point " + item.dataIndex + " ("+item.datapoint[0]+","+item.datapoint[1]+") in " + item.series.label + ".");
      event.originalEvent.plot.highlight(item.series, item.datapoint);
    }
        });
</script>
        <div id="topicsHover"></div>
        <div id="topicsClick"></div>
    <sjc:chart
        id="chartObjects"
        cssStyle="width: 600px; height: 400px;"
        onClickTopics="chartClick"
        onHoverTopics="chartHover"
    >
        <sjc:chartData
                label="List with Objects"
                list="objList"
                listKey="myKey"
                listValue="myValue"
                points="{ show: true }"
                lines="{ show: true }"
                clickable="true"
                hoverable="true"
        />
    </sjc:chart>

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