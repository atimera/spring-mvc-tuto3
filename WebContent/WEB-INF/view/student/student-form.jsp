<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName" />
		<br><br>
		Last Name: <form:input path="lastName" />
		<br><br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
			
			<!-- theCountryOptions is populate form a properties file -->
			<%-- <form:options items="${theCountryOptions}" /> --%>
		</form:select>
		<br><br>

		Favorite Language: 
		<form:radiobuttons path="favoriteLanguage" items="${student.languages}" delimiter=" "/>	
		<br><br>
		
		Operating System:
		<form:checkbox label="Linux" path="operatingSystems" value="Linux" />
		<form:checkbox label="MS Windows" path="operatingSystems" value="MS Windows" />
		<form:checkbox label="Mac OS" path="operatingSystems" value="Mac OS" />
		<form:checkbox label="Android" path="operatingSystems" value="Android" />
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>