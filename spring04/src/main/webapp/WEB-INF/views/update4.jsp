<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background: blue
}
</style>
</head>
<body>
노래수정이 완료되었습니다.
<button><a href="music.jsp">이전화면</a></button><br>
수정 요청된 id : ${bag.id}<br>
수정된 content : ${bag.content}<br>
</body>
</html>