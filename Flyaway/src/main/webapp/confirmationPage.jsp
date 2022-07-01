<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Reservation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>
The following flight was booked
<table border="1">
  <tr>
    <th>Email</th>
    <th>Country</th>
    <th>Source Airport Name</th>
    <th>Destination Airport Name</th>
    <th>Airline Name</th>
    <th>Ticket Price</th>
    <th>Departure Date</th>
    <th>Return Date</th>
    
    <%
       Object obj = session.getAttribute("myReservation");
       Reservation myReservation = (Reservation)obj;
    %>
       <tr>
         <td><%=myReservation.getContact_email_address() %></td>
         <td><%=myReservation.getCountry() %></td>
         <td><%=myReservation.getSource_airport_name() %></td>
         <td><%=myReservation.getDestination_airport_name() %></td>
         <td><%=myReservation.getAirline() %></td>
         <td><%=myReservation.getPrice() %></td>
         <td><%=myReservation.getDeparture_date() %></td>
         <td><%=myReservation.getReturn_date() %></td>
       </tr>
     <% 
      
    %>
  </tr>
</table>
<br/>
Thank You For Your Purchase
<br/>
<br/>
<jsp:include page= "NavigationFooter.jsp"/>
</body>
</html>