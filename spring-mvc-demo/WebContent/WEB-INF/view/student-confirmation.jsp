
<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>
The student is confirmed: ${student.firstName} ${student.lastName}
<br>
Country is : ${student.country}
<br>
Language is : ${student.language}
<br>
Operating Systems is :
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
		<li>${temp}</li>
	</c:forEach> 
</ul>
</body>