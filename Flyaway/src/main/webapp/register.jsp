<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body>
  <form action="LoginController" method="post">
    <h1>User Information</h1>
    <table>
      <tbody>
        <tr>
          <td>First Name</td>
          <td><input type="text" name="firstName" required></td>
        </tr>
        <tr>
          <td>Last Name</td>
          <td><input type="text" name="lastName" required></td>
        </tr>
        <tr>
        <tr>
          <td>Email Address</td>
          <td><input type="text" name="email" required></td>
        </tr>
        <tr>
          <td>Mailing Address</td>
          <td><input type="text" name="mailingAddress" required></td>
        </tr>
        <tr>
          <td>City</td>
          <td><input type="text" name="city" required></td>
        </tr>
        <tr>
          <td>State</td>
          <td><input type="text" name="state" required></td>
        </tr>
        <tr>
          <td>Zip Code</td>
          <td><input type="text" name="zipCode" required></td>
        </tr>
        <tr>
          <td>Password</td>
          <td><input type="password" name="password" required></td>
        </tr>
        <tr>
          <td>Confirm Password</td>
          <td><input type="password" name="confirmPassword" required></td>
        </tr>
      </tbody>
    </table>
    <input type="submit" value="submit"><br/> 
    <input type="reset" value="reset"><br/>
  </form>
  <br/>
  Already have an account? <br/>
  <a href="Login.jsp">Login Here</a>
  <%session.setAttribute("option",request.getParameter("option")); %>
  <br/>
  <br/>
  <jsp:include page= "NavigationFooter.jsp"/>
</body>
</html>