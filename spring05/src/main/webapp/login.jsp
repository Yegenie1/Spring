<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(session.getAttribute("id")==null){ %>
<h3>로그인 화면입니다.</h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"> <br>
	pw : <input name="pw" value="1234"> <br>
	<button type="submit">서버로 전송</button>
</form>
	<a href="bbs.jsp">
	<button style="background: pink">비회원 게시판보기</button>
</a>
<a href="news.jsp">
	<button style="background: pink">비회원 뉴스사이트</button>
</a>
<a href="cafe.jsp">
	<button style="background: pink">비회원 카페사이트</button>
</a>
<%}else{ %>
<hr color="red">
${id}님이 로그인 중입니다~!
<a href="bbs.jsp">
	<button style="background: pink">게시판화면</button>
</a>
<a href="news.jsp">
	<button style="background: pink">뉴스사이트</button>
</a>
<a href="cafe.jsp">
	<button style="background: pink">카페사이트</button>
</a>
<%} %>
</body>
</html>