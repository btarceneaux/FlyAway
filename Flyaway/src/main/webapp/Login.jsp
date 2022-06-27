<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController" method="get">
    <h1>User Logon</h1>
    <table>
      <tbody>
        <tr>
          <td>Email Address</td>
          <td><input type="text" name="email" required></td>
        </tr>
        <tr>
          <td>Password</td>
          <td><input type="text" name="password" required></td>
        </tr>
        <tr>
          <td>Admin <input type="radio" name="typeOfUser" value="admin" required></td>
        </tr>
        <tr>
          <td>User <input type="radio" name="typeOfUser" value="user" required></td>
      </tbody>
    </table>
    <input type="submit" value="submit"><br/> 
    <input type="reset" value="reset"><br/>
  </form>
</body>
</html>