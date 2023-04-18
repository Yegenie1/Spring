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
음식추가 처리 요청이 완료되었습니다.
<table>
<tr>
	<td class="top">no</td>
	<td class="top">name</td>
	<td class="top">price</td>
	<td class="top">image</td>
</tr>
<tr>
	<td class="down">${bag.no}</td>
	<td class="down">${bag.name}</td>
	<td class="down">${bag.price}</td>
	<td class="down"><img src="resources/img/${bag.img}" width="150" height="150"></td>
	
</tr>
</table>
</body>
</html>