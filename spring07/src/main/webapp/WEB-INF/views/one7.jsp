<%@page import="com.multi.mvc06.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h3>id 100의 상세정보</h3>
<table border="1">
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
		<td class="down"><img src="resources/img/${bag.img}" width="150" height="150"></td>
	</tr>
</table>
