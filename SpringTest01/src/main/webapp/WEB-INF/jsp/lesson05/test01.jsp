<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제1</title>
</head>
<body>
	<h2>1.JSTL 코어</h2>
	
	<h4> 첫번째 숫자 : <c:set var="num1" value="36" /> </h4>
	<h4> 두번째 숫자 : <c:set var="num2">3</c:set> </h4>
	
	<h2>2.JSTL core연산 </h2>
	
	<h4>더하기 : ${num1 + num2 }</h4>
	<h4>빼기 : ${num1 - num2 }</h4>
	<h4>곱하기 : ${num1 * num2 }</h4>
	<h4>나누기 : ${num1 / num2 }</h4>
	
	
</body>
</html>