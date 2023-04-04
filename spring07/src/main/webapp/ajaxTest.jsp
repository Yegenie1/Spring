<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url:"list5.multi",
			success: function(x) {
				$('#result').append(x)
				
			}//success
		})//ajax
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url:"list5.multi",
				success: function(x) {
					$('#result').append(x)
					
				}//success
			})//ajax
		})//b1
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url:"list6",
				data : {
					bbsno : 3
				},
				success: function(x) {
					$('#result').append(x)
					
				}//success
			})//ajax
		})//b2
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url:"list6",
				data : {
					bbsno : 4
				},
				success: function(x) {
					$('#result').append(x)
					
				}//success
			})//ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url:"one5",
				data : {
					id : "apple"
				},
				success: function(x) {
					$('#result').append(x)
					
				}//success
			})//ajax
		})//b4
		

		$('#b5').click(function() {
			$('#result').empty()
			$.ajax({
				url:"one6.multi",
				data : {
					no : 6
				},
				success: function(x) {
					$('#result').append(x)
					
				}//success
			})//ajax
		})//b5
		
		$('#b6').click(function() {
			$('#result').empty()
			$.ajax({
				url:"list7",
				success: function(x) {
					$('#result').append(x)
					
				}//success
			})//ajax
		})//b6
		
		$("#btnUp").click(function() {
			$.ajax({
				url: "update2.multi",
				data: {
					no: $('#updateNO').val(),
					content:$('#updateContent').val()
				},
				success: function(x) {
					alert('수정완료!')
					
					//document.location.reload();ajax 새로고침
					//location.href="list5.multi"
					$('#result').append(x)
				}
			})
		})
		
		$("#btnDel").click(function() {
			$.ajax({
				url: "delete2.multi",
				data: {
					no: $('#deleteNO').val()
				},
				success: function() {
					alert('삭제완료!')
					location.href="ajaxTest.jsp"
				}
			})
		})
		
		$('#b7').click(function() {
			$('#result').empty()
			$.ajax({
				crossOrigin: true,
				url:'http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metirc&lang=kr&appid=43238037f8f84c1b9d70369513a425e6',
				dataType : 'json',
				success: function(x){
					console.log(x);
					$('#result').html("위치"+x.name+"<br>"+
							"날씨"+x.weather[0].description+"<br>"+
							"풍속"+x.wind.speed+"<br>"+
							"최고 기온"+x.main.temp_max+"<br>"+
							"최저 기온"+x.main.temp_min+"<br>"+
							"체감 온도"+x.main.feels_like+"<br>"+
							"구름"+x.clouds.all+"<br>")
				}
				
			})
		})//b7
	})//$
</script>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button>
<button id="b2">bbs번호 3번 reply리스트 가지고 오기</button>
<button id="b3">bbs번호 4번 reply리스트 가지고 오기</button>
<button id="b4">member id가 apple인 사람의 정보 가지고 오기</button>
<button id="b5">bbsno가 6인 게시물의 상세 정보 가지고 오기</button>
<button id="b6">member의 모든 리스트 가지고 오기</button>
<hr color="red">
수정할 no : <input id="updateNO"><br>
수정할 content : <input id="updateContent">
<button id="btnUp" >수정</button>
<hr color="red">
삭제할 no : <input id="deleteNO">
<button id="btnDel" >삭제</button>
<hr color="red">
<button id="b7">날씨 알아오기!</button>
<hr>
<div id="result"></div>
</body>
</html>