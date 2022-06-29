<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.SourceAndDestination"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Source And Destination</title>
</head>
<body>
<table border="1">
  <tr>
    <th>Source City</th>
    <th>Destination City</th>
  </tr>
  <%
  Object obj = session.getAttribute("sourceDestination");
  List<SourceAndDestination> sourceDestinationList = (List<SourceAndDestination>)obj; 
  
  if(sourceDestinationList.size() > 0)
  {
	  Iterator<SourceAndDestination> sadIterator = sourceDestinationList.iterator();
	  while(sadIterator.hasNext())
	  {
		  SourceAndDestination sad = sadIterator.next();
		  %>
		  <tr>
		    <td><%=sad.getSourceCity() %></td>
		    <td><%=sad.getDestinationCity() %></td>
		  </tr>
		  
		  <% 
	  }
  }
  %>
</body>
</html>