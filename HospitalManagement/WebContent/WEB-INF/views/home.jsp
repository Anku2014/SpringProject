<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Hospital Management</title>
</head>
<body>
<h1 style="color:black; text-align:center">Hospital Management System</h1>
<p style="text-align:center; color:green">
<a href="${pageContext.request.contextPath}/registerpatient/form">Patient Registration</a></br><br>
<a href="${pageContext.request.contextPath}/registerphysician/form">Physician Registration</a></br><br>
<a href="${pageContext.request.contextPath}/searchphysician/form">Physician Search</a></br><br>
<a href="${pageContext.request.contextPath}/viewpatient/form">Patient Details</a></br><br>
<a href="${pageContext.request.contextPath}/patientdiagnosisview/form">Patient Diagnosis Details</a></br><br>
</p>

</body>
</html>