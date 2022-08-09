<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Pizza Insert</title>
</head>
<body>

	<h1>Pizza Insert</h3>
	
	<form action="./add" method="post">
		<input type="hidden" name="id" value="0" />
		name : <input type="text" name="name" /> <br />
		price : <input type="number" name="price" /> <br />
		calories : <input type="number" name="calories" step="0.01" /> <br />
		<input type="submit" /> <input type="reset" />
	</form>
	
	


</body>
</html>