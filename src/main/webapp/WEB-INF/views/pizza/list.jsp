<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Pizza List</title>
</head>
<body>

	<h1>Pizza List</h1>
	
	<a href="./add">등록</a>
	<ul>
 		<c:forEach items="${pizzas }" var="pizza">
 			<li>
 				<a href="./info?id=${pizza.id }"> ${pizza.name } (${pizza.price })  - ${pizza.calories } calories</a>
 			</li> 		
 		</c:forEach>
 	</ul>
	
	<script type="text/javascript">
		//const btnAdd = document.getElementById("btnAdd");		
	</script>

</body>
</html>