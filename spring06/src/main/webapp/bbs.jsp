<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 게시물 조회수 ${count}
<%if(session.getAttribute("id")!=null){ %>
<h3>게시판 등록 화면입니다.</h3>
<hr color="red">
<form action="insert2.multi" method="get">
	no : <input name="no" value="1"> <br>
	title : <input name="title" value="apple"> <br>
	content : <input name="content" value="pine"> <br>
	writer : <input name="writer" value=${id}> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>게시판수정 화면입니다.</h3>
<hr color="red">
<form action="update2.multi" method="get">
	no : <input name="no" value="1"> <br>
	content : <input name="content" value="pine"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판탈퇴 화면입니다.</h3>
<hr color="red">
<form action="delete2.multi" method="get">
	no : <input name="no" value="1"> <br>
	<button type="submit">서버로 전송</button>
</form>
<%}else{ %>
<a href="login.jsp">
	<button style="background: pink">로그인 화면으로 go</button>
</a>

<%} %>
<hr color="red">
<h3>게시판 전체 검색 화면입니다.</h3>
<a href="list2.multi">모든 게시판정보 가져오기</a>
<h3>게시판검색 화면입니다.</h3>
<hr color="red">
<form action="one2.multi" method="get">
	no : <input name="no" value="1"> <br>
	<button type="submit">서버로 전송</button>
</form><hr color="red">
</body>
</html>