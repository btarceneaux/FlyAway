<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Airlines"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Airlines</title>
</head>
<body>
<table border="1">
  <tr>
    <th>IATA</th>
    <th>Airline Name</th>
    <th>Country</th>
    <%
      Object obj = session.getAttribute("activeAirlinesList");
      List<Airlines> airlinesList = (List<Airlines>)obj;
      
      if(airlinesList.size() > 0)
      {
    	  Iterator<Airlines> ai = airlinesList.iterator();
    	  while(ai.hasNext())
    	  {
    		  Airlines air = ai.next();
    		  %>
    		  <tr>
    		    <td><%=air.getIata() %></td>
    		    <td><%=air.getAirline_name() %></td>
    		    <td><%=air.getCountry() %></td>
    		  </tr>
    		  <% 
    	  }
      }
    
    %>
  </tr>
</table>
<br/>
<br/>
<jsp:include page= "NavigationFooter.jsp"/>
</body>
</html>