<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>

	The Student is Confirmed : ${student.firstName} ${student.lastName}
	<br><br>
	Country: <i>${student.country}</i>
	<br><br>
	Favorite Language: <i>${student.favoriteLanguage}</i>
	<br><br>
	Operation Systems: 
	<ul>
		<c:forEach var="os" items="${student.operatingSystems}">
		
			<li>${os}</li>
				
		</c:forEach>
	
	</ul>

</body>
</html>