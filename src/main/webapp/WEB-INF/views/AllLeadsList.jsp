<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
    <a href="/">Create New Lead</a>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads List</title>
</head>
<body>
      <h2>All Leads List | Leads List</h2>
      <hr>
      
      <table border='1'>
      <tr>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Source</th>
      <th>Email</th>
      <th>Mobile</th>
      </tr>
      
      <c:forEach var = "lead" items="${leads }">
      <tr>
      <td><a href="leadInfo?id=${lead.id }">${lead.firstName}</a></td>
      <td>${lead.lastName}</td>
      <td>${lead.source}</td>
      <td>${lead.email}</td>
      <td>${lead.mobile}</td>
      </tr>
      </c:forEach>
      
      </table>
      
</body>
</html>