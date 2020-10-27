<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.red {
	color: black;
	font-weight: bold;
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
		action="${pageContext.request.contextPath}/patientdiagnosisview/processpatientdiagnosis"
		modelAttribute="patientDiagnosis">
    
    <h1>Patient Diagnosis</h1>
        
        Patient ID: <form:input path="patientId" />
		<span><form:errors path="patientId" cssClass="black"></form:errors></span>
		<br>
        
        Symptoms: <form:input path="symptoms" />
		<span><form:errors path="symptoms" cssClass="black"></form:errors></span>
		<br>
        
        Diagnosis: <form:input path="diagnosis" />
		<span><form:errors path="diagnosis" cssClass="black"></form:errors></span>
		<br>
        
        Physician: <form:input path="physicianName" />
		<span><form:errors path="physicianName" cssClass="black"></form:errors></span>
		<br>
        Date of Diagnosis: <form:input path="dateOfDiagnosis" />
		<span><form:errors path="dateOfDiagnosis" cssClass="black"></form:errors></span>
		<br>
		 <label>Follow Up: </label>
		 <select id="mylist">
		 <option value="1">Yes</option>
		 <option value="2">No</option>
		 </select>
		<span><form:errors path="followUp" cssClass="black"></form:errors></span>
		<br>
		Date of Follow Up: <form:input path="dateOfFollowUp" />
		<span><form:errors path="dateOfFollowUp" cssClass="black"></form:errors></span>
		<br>
		Bill Amount: <form:input path="billAmount" />
		<span><form:errors path="billAmount" cssClass="black"></form:errors></span>
		<br>
		Card Number: <form:input path="cardNumber" />
		<span><form:errors path="cardNumber" cssClass="black"></form:errors></span>
		<br>
		Mode Of Payment: <form:input path="mode" />
		<span><form:errors path="mode" cssClass="black"></form:errors></span>
		<br>
		
		
		
		<input type="submit" value="Submit">
		<input type="reset" value="Reset">
	</form:form>
</body>
</html>