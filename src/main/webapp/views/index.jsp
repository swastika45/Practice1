<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Student registration form</h3>

<form:form action=" save" modelAttribute="st1">
     <table>
     <tr>
      <td>Name:</td>
      <td><form:input path="name"/></td>
     </tr>

       </table>
</form:form>
</body>
</html>