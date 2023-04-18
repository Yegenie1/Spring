<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
메뉴 전체검색 요청이 완료되었습니다.<br>
<!-- bag.getId()  -->
<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.!라는 의미! -->
<!-- 	for (String s : list) {
			
		}
 -->
<table>
<tr>
	<td class="top">no</td>
	<td class="top">name</td>
	<td class="top">price</td>
	<td class="top">image</td>
</tr>
<c:forEach items="${list}" var="bag">
<tr>
	<td class="down">${bag.no}</td>
	<td class="down"><a href="one3.multi?no=${bag.no}">${bag.name}</a></td>
	<td class="down">${bag.price}</td>
	<td class="down"><img src="resources/img/${bag.img}" width="150" height="150"></td>
	
</tr>
</c:forEach>
</table>
</body>
</html>