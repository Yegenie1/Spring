<%@page import="com.multi.mvc06.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			content= $('#reply').val()
			writer="apple"
			$.ajax({
				url:"insert4",
				data:{
					bbsno: ${bag.no},
					content:content,
					writer:writer
					
				},
				success : function() {
					alert("댓글달기 성공!")
					$('#result').append("- "+content+", "+writer+"<br>")
					$('#reply').val('')
					//val(): 입력한 값을 가지고온다
					//val('~~') : ''안의 값을 가져온다
				}
			})
		})	
	})

</script>
<style>
body {
	background: green
}
</style>
</head>
<body>
	<a href="bbs.jsp">
		<button style="background: pink">게시판 화면으로 go</button>
	</a>
	<a href="list2">
		<button style="background: pink">게시물 전체 목록페이지</button>
	</a>
	<hr color="red">
	<%
		//세션에서 값을 꺼내는 방법
	String id = (String) session.getAttribute("id");

	//모델에서 값을 꺼내는 방법
	//model.addAttribute("bag",bag);
	BbsVO bag = (BbsVO) request.getAttribute("bag");
	String writer = bag.getWriter();
	if (id != null) {

		if (id.equals(writer)) {
	%>
	<a href="update2">
		<button style="background: pink">수정</button>
	</a>
	<a href="delete2.multi?no=${bag.no }">
		<button style="background: pink">삭제</button>
	</a>

	<%
		}
	}
	%>

	게시물검색이 완료되었습니다
	<br> ${bag.no}
	<br> ${bag.title}
	<br> ${bag.content}
	<br> ${bag.writer}
	<br>

	<hr color="red">
	댓글달기
	<input id="reply">
	<button id="b1">댓글달기</button>
	<br>
	<hr color="blue">
	<div id="result">
		<c:forEach items="${list}" var="bag"> 
	- ${bag.content}, ${bag.writer} <br>
		</c:forEach>
	</div>



</body>
</html>