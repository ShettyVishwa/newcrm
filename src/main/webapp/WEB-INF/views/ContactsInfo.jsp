<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts Information</title>
</head>
<body>
      <h2>Contacts Information</h2>
      <hr>
      
      Lead Id: ${contact.id }<br/>
      First Name : ${contact.firstName }<br/>
      Last Name : ${contact.lastName }<br/>
      Email : ${contact.email }<br/>
      Mobile : ${contact.mobile }<br/>
      
</body>
</html>