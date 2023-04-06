<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8ab6186bb587538d75199b2dc9588259"></script>
<script type="text/javascript">

google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);
	$(function() {
		$('#b1').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "one2",
						data : {
							id : "apple"
						},
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							table = "<table><tr><td>항목명</td><td>값</td></tr>"
									+ "<tr><td>아이디</td><td>" + id
									+ "</td></tr>" + "<tr><td>패스워드</td><td>"
									+ pw + "</td></tr>" + "<tr><td>이름</td><td>"
									+ name + "</td></tr>"
									+ "<tr><td>전화번호</td><td>" + tel
									+ "</td></tr></table>"
							$('#result').append(table)
						} //success
					}) //ajax
				})//b1
		$('#b2').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "list2",
						dataType : "json",
						success : function(json) {
							id = json[5].id
							pw = json[5].pw
							name = json[5].name
							tel = json[5].tel //json에서 tel키로 값을 추출
							table = "<table><tr><td>항목명</td><td>값</td></tr>"
									+ "<tr><td>아이디</td><td>" + id
									+ "</td></tr>" + "<tr><td>패스워드</td><td>"
									+ pw + "</td></tr>" + "<tr><td>이름</td><td>"
									+ name + "</td></tr>"
									+ "<tr><td>전화번호</td><td>" + tel
									+ "</td></tr></table>"

							ul = "<ul><li>" + id + "</li>" + "<li>" + pw
									+ "</li>" + "<li>" + name + "</li>"
									+ "<li>" + tel + "</li></ul>"
							$('#result').append(table + ul)
						} //success
					}) //ajax
				})//b2

		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "map",
				dataType : 'json',
				success : function(json) {

					lat = json.lat
					lon = json.lon

					var mapContainer = document.getElementById('result'), // 지도를 표시할 div 
					mapOption = {
						center : new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
						level : 3
					// 지도의 확대 레벨
					};

					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

					// 마커가 표시될 위치입니다 
					var markerPosition = new kakao.maps.LatLng(lat, lon);

					// 마커를 생성합니다
					var marker = new kakao.maps.Marker({
						position : markerPosition
					});

					// 마커가 지도 위에 표시되도록 설정합니다
					marker.setMap(map);

				}

			})
		})
		

	})//$
	
	function drawChart() {
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "chart",
				dataType : 'json',
				success : function(array) {

					 var data = google.visualization.arrayToDataTable([
				          ['Task', 'Hours per Day'],
				          [array[0].doing, array[0].time],
				          [array[1].doing, array[1].time],
				          [array[2].doing, array[2].time],
				       
				        ]);

				        var options = {
				          title: 'My Daily Activities'
				        };

				        var chart = new google.visualization.PieChart(document.getElementById('result'));

				        chart.draw(data, options);

				}

			})
		})
		
	}
</script>

</head>
<body>
	<button id="b1">컨트롤러에서 member JSON(table)을 받아오자.!</button>
	<button id="b2">컨트롤러에서 member list JSON(table,ul)을 받아오자.!</button>
	<hr color="blue">
	<button id="b3">지도!!</button>
	<button id="b4">차트!!</button>
	<div id="result" style="width: 350px; height: 350px;"></div>
	

</body>
</html>