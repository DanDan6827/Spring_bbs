<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#header{margin: 0 auto; width: 600px; text-align: center; font-weight: bold; font-size: 40px;}
#login{float: right;}
</style>
</head>
<body>
	<div id="wrap">
		<div id="header">
		<span class="title2"> ICT 문의 게시판</span>
		</div>
		<div id="nav">
			<div id="login">
				<c:choose>
					<c:when test="${login=='ok'}">
					${mvo.name}님 |<button onclick = "logout()">로그아웃</button>
					</c:when>
					<c:otherwise><button onclick="login()">로그인</button> | <button onclick="">회원가입</button></c:otherwise>
				</c:choose>
			</div>
		</div>
	
	</div>
</body>
</html>