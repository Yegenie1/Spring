<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>메뉴을 추가하세요~</h3>
<hr color="red">
<form action="insert3.multi" method="get">
	name : <input name="name" value="apple"> <br>
	price : <input name="price" value="10000"> <br>
	img : <input name="img" value="1.png" type="file"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>메뉴을 삭제하세요~</h3>
<hr color="red">
<form action="delete3.multi" method="get">
	no : <input name="no" value="1"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>가격을 수정하세요~</h3>
<hr color="red">
<form action="update3.multi" method="get">
	no : <input name="no" value="1"> <br>
	price : <input name="price" value="10000"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>메뉴을 검색하세요 하나만~</h3>
<hr color="red">
<form action="one3.multi" method="get">
	no : <input name="no" value="1"> <br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<a href = "list3.multi">메뉴 전체 목록 가지고 오기 </a>
</body>
</html>