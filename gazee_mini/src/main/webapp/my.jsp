<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#check').click(function() {
			$('#result').empty()
			$.ajax({
				url : "seedcheck",
				data : {
					nickname : $('#nickname').val()
				},
				success : function(x) {
					$('#result').append(x)

				}//success
			})//ajax	 
			$('#selltb').empty()
			$.ajax({
				url : "selltb",
				data : {
					seller : $('#nickname').val()
				},
				success : function(x) {
					$('#selltb').append(x)

				}//success
			})//ajax
			$('#buytb').empty()
			$.ajax({
				url : "buytb",
				data : {
					buyer : $('#nickname').val()
				},
				success : function(x) {
					$('#buytb').append(x)
				}//success
			})//ajax
		})//check
		
		$('#charge').click(function() {
			$('#result').empty()
			$.ajax({
				url : "upseed",
				data : {
					nickname : $('#nickname').val(),
					seed : $('#deposit').val()
				},
				success : function(x) {
					$('#result').append(x)

				}//success
			})//ajax		
		})//check
	})//$
</script>
<link rel="stylesheet" href="resources/css/nav.css" type="text/css">
</head>
<body>
	<div id="wrap">
		<div id="header">
			<div id="login">
				<ul class="user">
					<li>로그인</li>
					<li id="line">|</li>
					<li>회원가입</li>
				</ul>
			</div>
			<div class="headerContent">
				<img src="resources/img/gazee_logo.png" id="logo">
				<ul class="menu">
					<li>마이페이지</li>
					<li>커뮤니티</li>
					<li>고객센터</li>
					<li>신고하기</li>
					<li><button id="sell">판매하기</button></li>
				</ul>
			</div>
		</div>
		<div id="content">
			<div id="my">
				<div>
					<button id="updel">개인정보 수정 및 탈퇴하기</button>
				</div>
				<div>
					<img src="resources/img/pay.png" id="left">
				</div>
				<div>
					<ul class="nick">
						<li>닉네임 입력 :</li>
						<li><input id="nickname"></li>
						<li><button id="check">확인</button></li>
					</ul>
				</div>
				<ul class="pay">
					<li>가지페이잔액 :</li>
					<li><div id="result">0</div></li>
					<li>원 |</li>
					<li>충전소</li>
					<li><input id="deposit"></li>
					<li><button id="charge">충전하기</button></li>
				</ul>
				<div>
					<img src="resources/img/sell.png" id="left">
				</div>
				<div id="selltb"></div>
				<div>
					<img src="resources/img/buy.png" id="left">
				</div>
				<div id="buytb"></div>
			</div>
		</div>
	</div>
	<div id="footer">
		<div>
			<p style="margin: 0; font-size: 12px;">Copyrightⓒ 2023. gazee.
				All rights reserved.</p>
		</div>
	</div>
</body>
</html>