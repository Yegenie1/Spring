<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table border="1">
	<tr>
		<td class="top">no</td>
		<td class="top">buyer</td>
		<td class="top">price</td>
	</tr>
	<c:forEach items="${list}" var="bag">
		<tr>
			<td class="down">${bag.no}</td>
			<td class="down">${bag.buyer}</td>
			<td class="down">${bag.price}</td>
		</tr>
	</c:forEach>
</table>