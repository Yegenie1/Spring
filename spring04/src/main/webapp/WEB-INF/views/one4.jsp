<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: gray;
}
td{
	width: 100px;
	text-align: center;
}
.top{
	background: black;
	color: white;
}
.down{
	background: white;
}
</style>
</head>
<body>
	<!--  표현식(expression) -->
	노래검색 처리 요청이 완료되었습니다.
	<button><a href="music.jsp">이전화면</a></button>
	<br>
	<!-- bag.getId()  -->
	<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
	<table>
		<tr>
	<td class="top">id</td>
	<td class="top">title</td>
	<td class="top">artist</td>
	<td class="top">content</td>
	<td class="top">img</td>
</tr>
<tr>
	<td class="down">${bag.id}</td>
	<td class="down">${bag.title}</td>
	<td class="down">${bag.artist}</td>
	<td class="down">${bag.content}</td>
	<td class="down"><img src="resources/img/${bag.img}" width="200" height="200"></td>
	
</tr>
	</table>


</body>
</html>