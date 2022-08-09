<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="EUC-KR">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdnjs.cloudflare.com/ajax/libs/tsparticles/1.18.11/tsparticles.min.js"></script>
<title>박민호의 개인 웹 페이지 입니다.</title>
<style type="text/css">
		#tsparticles {
    		position: absolute;
    		top: 0;
    		left: 0;
    		width: 100%;
    		height: 100%;
  		}
      	.back{
        	width: 100%;
        	height: 100%;
        	background-color: black;
      	}
</style>
</head>
<body>

    <div class="back">
      <div id="tsparticles"></div>
    </div>

    <div class="back">
      <div id="tsparticles2"></div>
    </div>

    <div class="back">
      <div id="tsparticles3"></div>
    </div>

    <div class="back">
      <div id="tsparticles4"></div>
    </div>
        
	<script src="<c:url value="/resources/js/profile.js" />"></script>	
</body>
</html>