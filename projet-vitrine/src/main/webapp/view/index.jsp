<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>- Mon index JSP -</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

	<div align="center">

		<h1>Affichage des Adresses</h1>

		<table border="1">
			<thead>
				<tr>
					<th>Adresse ID</th>
					<th>Nom</th>
					<th>Option</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listAdresses}" var="adresse">
					<tr>
					<td>${adresse.adrId}</td>
					<td>${adresse.adrNom}</td>
						<td><a href="${pageContext.request.contextPath}/DonneesForm">Option</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</body>
</html>