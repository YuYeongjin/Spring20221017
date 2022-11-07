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
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>고객 전체 목록</h1>
				<table class="table">
					<thead>
						<tr>
							<th>id</th>
							<th>Name</th>
							<th>ContactName</th>
							<th>Address</th>
							<th>City</th>
							<th>PostalCode</th>
							<th>Country</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customerList }" var="customer">
							<tr>
								<td>${customer.id }</td>
								<td>${customer.name }</td>
								<td>${customer.contactName }</td>
								<td>${customer.address }</td>
								<td>${customer.city }</td>
								<td>${customer.postalCode }</td>
								<td>${customer.country }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col">
				<nav aria-label="Page navigation example">
				  <ul class="pagination justify-content-center">
				  
				  	<c:if test="${pageInfo.leftPage != 1 }">
				  		<c:url value="/ex24/sub02" var="pageLink">
				    		<c:param name="page" value="1"></c:param>
				    	</c:url>
				  		<li class="page-item">
					      <a class="page-link" href="${pageLink }" aria-label="Previous">
					        <span aria-hidden="true">&laquo;</span>
					      </a>
					    </li>
				  	</c:if>
				  
				    <c:forEach begin="${pageInfo.leftPage }" end="${pageInfo.rightPage }" var="pageNumber">
				    	<c:url value="/ex24/sub02" var="pageLink">
				    		<c:param name="page" value="${pageNumber }"></c:param>
				    	</c:url>
				    	
					    <li class="page-item ${pageInfo.current eq pageNumber ? 'active' : '' }"><a class="page-link" 
					    href="${pageLink }">${pageNumber }</a></li>
				    </c:forEach>
				    
				    <c:if test="${pageInfo.rightPage != pageInfo.lastPage }">
				  		<c:url value="/ex24/sub02" var="pageLink">
				    		<c:param name="page" value="${pageInfo.lastPage }"></c:param>
				    	</c:url>
				  		<li class="page-item">
					      <a class="page-link" href="${pageLink }" aria-label="Next">
					        <span aria-hidden="true">&raquo;</span>
					      </a>
					    </li>
				  	</c:if>
				  </ul>
				</nav>
			</div>
		</div>
	</div>
	
	
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
















