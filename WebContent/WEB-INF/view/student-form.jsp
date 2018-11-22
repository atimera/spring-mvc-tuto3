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
		
		<br><br>
		Favorite Language: 
		<form:radiobuttons path="favoriteLanguage" items="${student.languages}" delimiter=" || "/>
		
<%-- 		
		<form:radiobutton path="favoriteLanguage" value="Java" label="Java" />
		<form:radiobutton path="favoriteLanguage" value="C#" label="C#" />
		<form:radiobutton path="favoriteLanguage" value="PHP" label="PHP" />
		<form:radiobutton path="favoriteLanguage" value="Python" label="Python" />
		<form:radiobutton path="favoriteLanguage" value="C" label="C" />
		<form:radiobutton path="favoriteLanguage" value="C++" label="C++" />
		<form:radiobutton path="favoriteLanguage" value="Ruby" label="Ruby" />
 --%>		
 
		<br><br>
		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>