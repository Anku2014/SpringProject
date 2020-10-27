<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.red {
	color: black;
	font-weight: bold;
}
body {
    background-image:
        url("https://medicaldialogues.in/wp-content/uploads/2013/10/1.jpg");
    background-repeat: no-repeat;
    background-size: 1500px 700px;
}
input[type=text] {
  width: 10%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: white;
  background-color: green;
  color: white;
}
</style>
</head>
<body>
	<form:form
		action="${pageContext.request.contextPath}/registerpatient/processpatient"
		modelAttribute="patient">
    
    <h1 style="color:black; text-align:center">Patient Registration</h1>
        <p style="text-align:center; color:black">
        First Name: <form:input path="firstName" />
		<span><form:errors path="firstName" cssClass="black"></form:errors></span>
		<br>
        
        Last Name: <form:input path="lastName" />
		<span><form:errors path="lastName" cssClass="black"></form:errors></span>
		<br>
        
        Date Of Birth: <form:input path="dateOfBirth" />
		<span><form:errors path="dateOfBirth" cssClass="black"></form:errors></span>
		<br>
        
        Email: <form:input path="email" />
		<span><form:errors path="email" cssClass="black"></form:errors></span>
		<br>
        
        Contact Number: <form:input path="contactNumber" />
		<span><form:errors path="contactNumber" cssClass="black"></form:errors></span>
		<br>
         State: <form:input path="state" />
		<span><form:errors path="state" cssClass="black"></form:errors></span>
		<br>
		 
		 <label>Insurance plan: </label>
		 <select id="mylist">
		 <option value="1">ABC plan</option>
		 <option value="2">XYZ plan</option>
		 </select>
		<span><form:errors path="insurancePlan" cssClass="black"></form:errors></span>
		<br>
        
        
        Password: <form:input path="password" />
		<span><form:errors path="password" cssClass="black"></form:errors></span>
		<br>

		<input type="submit" value="Submit">
	</form:form>
	</p>
</body>
</html>