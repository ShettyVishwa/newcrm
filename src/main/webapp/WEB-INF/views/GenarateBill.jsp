<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Generation</title>
</head>
<body>
      <h2>Bill Generation | Generate</h2>
      <hr>
      
      <form action="generateBill" method="post">
      <table>
      <tr>
      <td>First Name</td>
      <td><input type="text" name="firstName"></td>
      </tr>
      
      <tr>
      <td>Last Name</td>
      <td><input type="text" name="lastName"></td>
      </tr>
      
      <tr>
      <td>Email</td>
      <td><input type="email" name="email"></td>
      </tr>
      
      <tr>
      <td>Mobile</td>
      <td><input type="text" name="mobile"></td>
      </tr>
      
      <tr>
      <td>Product</td>
      <td><input type="text" name="product"></td>
      </tr>
      
      <tr>
      <td>Amount</td>
      <td><input type="number" name="amount"></td>
      </tr>
      
      <tr>
      <td><input type="submit" value="Generate Bill"></td>
      </tr>
      </table>
      </form>
</body>
</html>