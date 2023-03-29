<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>북마크추가 화면입니다.</h3>
<hr color="red">
<form action="insert3.multi" method="get">
	name : <input name="name" value="apple"> <br>
	url : <input name="url" value="www.naver.com"> <br>
	img : <input name="img" value="1.png" type="file"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>북마크삭제 화면입니다.</h3>
<hr color="red">
<form action="delete3.multi" method="get">
	id : <input name="id" value="1"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>북마크수정 화면입니다.</h3>
<hr color="red">
<form action="update3.multi" method="get">
	id : <input name="id" value="1"> <br>
	name : <input name="name" value="apple"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>북마크 검색 화면입니다.</h3>
<hr color="red">
<form action="one3.multi" method="get">
	id : <input name="id" value="1"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
</body>
</html>