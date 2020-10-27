<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<style type=text/css>
body {
    background-image:
        url("https://medicaldialogues.in/wp-content/uploads/2013/10/1.jpg");
    background-repeat: no-repeat;
    background-size: 1500px 700px;
}
table,th,tr{
border: 1px solid black;
width: 300px;
background-color:#FFFFE0;
}
table.center {
  margin-left:auto; 
  margin-right:auto;
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1 style="color:black; text-align:center">Patient History</h1>
    <table class="center">
        
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Date Of Birth</th>
                <th>Contact Number</th>
            </tr>
        
        
            <c:forEach var="patients" items="${viewpatient}">
                <tr>
                    <td style="text-align:center"><c:out value="${patients.pid }" /></td>
                    <td style="text-align:center"><c:out value="${patients.firstName }" /></td>
                    <td style="text-align:center"><c:out value="${patients.lastName}" /></td>
                    <td style="text-align:center"><c:out value="${patients.dateOfBirth}" /></td>
                    <td style="text-align:center"><c:out value="${patients.contactNumber}" /></td>
                </tr>

			</c:forEach>
       
    </table>

 

 

</body>
</html>