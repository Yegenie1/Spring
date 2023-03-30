<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background: yellow
}
</style>
</head>
<body>
노래추가 처리 요청이 완료되었습니다.
<button><a href="music.jsp">이전화면</a></button>
<br>
추가요청된 id : ${bag.id}<br>
추가요청된 title : ${bag.title}<br>
추가요청된 artist : ${bag.artist}<br>
추가요청된 content : ${bag.content}<br>
추가요청된 img : ${bag.img}<br>
<img src="resources/img/${bag.img}" width="200" height="200">
</body>
</html>