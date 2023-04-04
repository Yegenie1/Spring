<%@page import="com.multi.mvc06.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<br>
no : ${bag.no}
<br>
title : ${bag.title}
<br>
content : ${bag.content}
<br>
writer : ${bag.writer}

<table border="1">
	<tr>
		<td class="top">no</td>
		<td class="top">title</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>
	<tr>
		<td class="down">${bag.no}</td>
		<td class="down">${bag.title}</td>
		<td class="down">${bag.content}</td>
		<td class="down">${bag.writer}</td>
	</tr>
</table>
