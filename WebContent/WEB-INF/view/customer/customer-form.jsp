<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Customer Registration Form</title>
	
	<style type="text/css">
		.error{ color: red; }
	</style>
	
</head>
<body>

	<i>Fill out the form. Asterisk (*) means required.</i>
	<form:form action="processForm" modelAttribute="customer" >
		<br>
		<label for="firstName">First Name:</label> 
		<form:input path="firstName" id="firstName"/>
		<br><br>
		
		<label for="lastName">Last Name (*):</label> 
		<form:input path="lastName" id="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>