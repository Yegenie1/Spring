<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table border="1">
	<tr>
		<td class="top">id</td>
		<td class="top">title</td>
		<td class="top">artist</td>
		<td class="top">content</td>
		<td class="top">img</td>
	</tr>
	<c:forEach items="${list}" var="bag">
		<tr>
			<td class="down">${bag.id}</td>
			<td class="down">${bag.title}</td>
			<td class="down">${bag.artist}</td>
			<td class="down">${bag.content}</td>
			<td class="down"><img src="resources/img/${bag.img}" width="150"
				height="150"></td>
		</tr>
	</c:forEach>
</table>
