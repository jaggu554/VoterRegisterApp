<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Voter Registration Application</title>
</head>
<body>
	<p>
		<font color="red">${msg}</font>
	</p>
	<h2>Voter Registration Form</h2>
	<form:form action="/save" modelAttribute="voter" method="POST">
		<br />
VoterName: <form:input path="voterName" />
		<br />
		<br />
VoterCaste: <form:input path="voterCaste" />
		<br />
		<br />
VoterConstituency: <form:input path="voterConstituency" />
		<br />
		<br />
VoterVillage: <form:input path="voterVillage" />

		<br />
		<br />
		<input type="submit" value="Register">
	</form:form>

</body>
</html>