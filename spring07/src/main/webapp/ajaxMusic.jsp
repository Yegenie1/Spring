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
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one7.multi",
				data : {
					id : 100
				},
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list8.multi",
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
	})
</script>

</head>
<body>
	<button id="b1">id로 상세정보 가져오기</button>
	<button id="b2">music 전체 리스트 가져오기</button>
	<hr color="red">
	<div id=result></div>
</body>
</html>