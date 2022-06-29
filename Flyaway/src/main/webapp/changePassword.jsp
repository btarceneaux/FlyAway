<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="PasswordController" method="post">
    <h1>Change Password</h1>
    <table>
      <tbody>
        <tr>
          <td>Current Password</td>
          <td><input type="text" name="currentPassword" required></td>
        </tr>
        <tr>
          <td>New Password</td>
          <td><input type="password" name="newPassword" required></td>
        </tr>
        <tr>
          <td>Confirm New Password</td>
          <td><input type="password" name="confirmPassword" required></td>
        </tr>
      </tbody>
    </table>
    <input type="submit" value="submit"><br/> 
    <input type="reset" value="reset"><br/>
  </form>
</body>
</html>