<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.even {
	background-color: silver;
}
</style>
<title>Faecher Uebersicht</title>
</head>
<body>

<form:form action="add.htm" commandName="subject">
	<table>
		<tr>
			<td>Fachname :</td>
			<td><form:input path="subjectName" /></td>
		</tr>
		<tr>
			<td>Studiengang :</td>
			<td><form:input path="studyCourse" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Fach und Studiengang speichern"></td>
		</tr>
	</table>
</form:form>
<c:if test="${fn:length(subjectList) > 0}">
	<table cellpadding="2">
		<tr class="even">
			<th>Fachname</th>
			<th>Studiengang</th>
		</tr>
		<c:forEach items="${subjectList}" var="subject" varStatus="status">
			<tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
				<td>${subject.subjectName}</td>
				<td>${subject.studyCourse}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>