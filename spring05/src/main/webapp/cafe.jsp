<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/buy.png" width="500" height="500">
<%if(session.getAttribute("id")!=null){ %>
<a href="bbb"><button>공동구매 참여</button></a>
<%}else {%>
<a href="login.jsp"><button>로그인하고 공동구매하기</button></a>
<%} %>
</body>
</html>