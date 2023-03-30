<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>검색 화면입니다.</h3>
<a href="list4.multi">모든 노래정보 가져오기</a>

<h3>노래추가 화면입니다.</h3>
<hr color="red">
<form action="insert4.multi" method="get">
	id : <input name="id" value="111"> <br>
	title : <input name="title" value="금요일에 만나요"> <br>
	artist : <input name="artist" value="아이유"> <br>
	content : <input name="content" value="IU"> <br>
	img : <input name="img" type="file"> <br>
	
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>노래수정 화면입니다.</h3>
<hr color="red">
<form action="update4.multi" method="get">
	id : <input name="id" value="101"> <br>
	content : <input name="content" value="아이유노래"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>노래삭제 화면입니다.</h3>
<hr color="red">
<form action="delete4.multi" method="get">
	id : <input name="id" value="106"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>노래검색 화면입니다.</h3>
<hr color="red">
<form action="one4.multi" method="get">
	id : <input name="id" value="101"> <br>
	<button type="submit">서버로 전송</button>
</form><hr color="red">
</body>
</html>