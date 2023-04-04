<%@page import="com.multi.mvc06.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
id가 ${bag.id}인 사람의 정보
<br>
id : ${bag.id}
<br>
pw : ${bag.pw}
<br>
name : ${bag.name}
<br>
tel : ${bag.tel}

<table border="1">
	<tr>
		<td class="top">id</td>
		<td class="top">pw</td>
		<td class="top">name</td>
		<td class="top">tel</td>
	</tr>
	<tr>
		<td class="down">${bag.id}</td>
		<td class="down">${bag.pw}</td>
		<td class="down">${bag.name}</td>
		<td class="down">${bag.tel}</td>
	</tr>
</table>
