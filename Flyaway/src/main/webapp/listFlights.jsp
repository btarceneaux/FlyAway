<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Flights"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Flights</title>
</head>
<body>
<table border="1">
  <tr>
    <th>Source Airport</th>
    <th>Source Airport Name</th>
    <th>Destination Airport</th>
    <th>Destination Airport Name</th>
    <th>Airline Alias</th>
    <th>Airline Name</th>
    <th>Ticket Price</th>
  </tr>
  <%
    Object obj = session.getAttribute("allFligths");
    List<Flights> flightList = (List<Flights>)obj;
    
    if(flightList.size() > 0)
    {
    	Iterator<Flights> fi = flightList.iterator();
    	while(fi.hasNext())
    	{
    		Flights fl = fi.next();
    		%>
    		<tr>
    		  <td><%=fl.getSource_airport() %></td>
    		  <td><%=fl.getName() %></td>
    		  <td><%=fl.getDestination_airport() %></td>
    		  <td><%=fl.getDestination_airport_name() %></td>
    		  <td><%=fl.getAlias() %></td>
    		  <td><%=fl.getAirline_name() %></td>
    		  <td><%=fl.getPrice() %></td>
    		</tr>
    		<% 
    	}
    }
  %>
<br/>
<br/>
<jsp:include page= "NavigationFooter.jsp"/>
</body>
</html>