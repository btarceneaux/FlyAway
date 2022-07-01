<%@page import="com.bean.Airports"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<br/>
<h3> Flight Details</h3>
<br>
<%
  Object obj = session.getAttribute("reservation");
  Airports airportReservation = (Airports)obj;

   //String departureDate = session.getAttribute("departureDate");
%>
<table border="1">
     <tr>
       <td>Country</td>
	   <td><%=airportReservation.getCountry() %></td>
	 </tr>
	 <tr>
	   <td>Source City</td>
	   <td><%=airportReservation.getCity() %></td>
	 </tr>
	 <tr>
	   <td>Source Airport Alias</td>
	   <td><%=airportReservation.getIata() %></td>
	 </tr>
	 <tr>
	   <td>Source Airport Name</td>
	   <td><%=airportReservation.getName() %></td>
	 </tr>
	 <tr>
	   <td>Destination Airport Alias</td>
	   <td><%=airportReservation.getDestination_airport() %></td>
	 </tr>
	 <tr>
	   <td>Destination Airport Name</td>
	   <td><%=airportReservation.getDestination_airport_name() %></td>
	 </tr>
	 <tr>
	   <td>Airline</td>
	   <td><%=airportReservation.getAirline_name() %></td>
	 </tr>
	 <tr>
	   <td>Price</td>
	   <td><%=airportReservation.getPrice() %></td>
	 </tr>
	 <tr>
	   <td>Departure Date</td>
	   <td><%=session.getAttribute("departureDate").toString() %></td>
	 </tr>
	 <tr>
	   <td>Return Date</td>
	   <td><%=session.getAttribute("returnDate").toString() %></td>
	 </tr>
 </table>
 
 <br/>
 
 <form action="ReservationController" method="post">
   <table>
     <h3>Payment</h3>
     <tr>
       <td>Name : </td>
     </tr>
     <tr>
       <td><input type="text" name="creditCardName" required></td>
     </tr>
     <tr>
       <td>Credit Card Number : </td>
     </tr>
     <tr>
       <td><input type="number" name="creditCardNumber" required></td>
     </tr>
     <tr>
       <td>Expiration Date : </td>
     </tr>
     <tr>
       <td><input type="date" name="expirationDate" required></td>
     </tr>
     <tr>
       <td>CVV Code : </td>
     </tr>
     <tr>
       <td><input type="number" name="creditCardNumber" required></td>
     </tr>
   </table>
   <input type="submit" value="submit"><br/> 
   <input type="reset" value="reset"><br/>
 </form>
<br/>
<br/>
<jsp:include page= "NavigationFooter.jsp"/>
</body>
</html>