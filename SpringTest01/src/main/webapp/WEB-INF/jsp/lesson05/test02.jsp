<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가요 순위표</title>
</head>
<body>
	
	<h2>HOT 5</h2>
	
	<table border="1">
		<thead>
			<tr>
				<th>순위</th>
				<th>제목</th>
			</tr>
		</thead>
		<tbody>
			<tr>
			
			<c:forEach var="music" items="${musicRanking }" varStatus="status">
	
				<td>${status.count }</td>
				<td>${music }</td>
			
			</c:forEach>
				
			</tr>
		</tbody>
	</table>
	
</body>
</html>