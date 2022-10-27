<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<h1>고객정보입력하기</h1>
	<form action="" method="post">
		<input type="text" placeholder="이름" name="name"> <hr>
		<input type="text" placeholder="계약명" name="contactName"><hr>
		<input type="text" placeholder="주소" name="address"><hr>
		<input type="text" placeholder="도시" name="city"><hr>
		<input type="text" placeholder="우편번호" name="postalCode"><hr>
		<input type="text" placeholder="국가" name="country"><hr>
		<input type="submit" value="입력하기">
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>