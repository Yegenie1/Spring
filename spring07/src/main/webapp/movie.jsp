<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {//body 부분이 dom tree로 메모리에 준비가 되었을 떄, 입력값으로 넣은 함수를 실행해주세요.
		$('#b2').click(function(){
			$.ajax({
				url : "movie",
				data : {
					title : $('#title').val(),
					price : $('#price').val()
				},
				success : function(x) {//변수만들어서 view아래 jsp파일로 넘기기
					//alert('computer요청 성공')
					//alert(x)
					$('#result').append(x+"<br>")
				},
				error : function() {
					alert('result 요청 실패')
				}
			})//ajax

		})//btn
		$('#b3').click(function(){
			$.ajax({
				url : "fruit",
				success : function(x) {//변수만들어서 view아래 jsp파일로 넘기기
					alert('fruit요청 성공')
					alert(x)
					$('#result').append(x+"<br>")
				},
				error : function() {
					alert('result 요청 실패')
				}
			})//ajax

		})//btn
		$('#b4').click(function(){
			$.ajax({
				url : "tour",
				success : function(x) {//변수만들어서 view아래 jsp파일로 넘기기
					alert('tour 요청 성공')
					alert(x)
					$('#result').append(x+"<br>")
				},
				error : function() {
					alert('result 요청 실패')
				}
			})//ajax

		})//btn

	})
</script>
</head>
<body>
영화제목 : <input id="title"> <br>
영화관람료 : <input id="price"><br>
<input id="b2" type="button" value="영화 예매 확인">
	<br>
	<input id="b3" type="button" value="과일목록 가지고 오기">
	<br>
	<input id="b4" type="button" value="여행목록 가지고 오기">
	<br>
<hr color="red">
<div id="result"></div>
</body>
</html>