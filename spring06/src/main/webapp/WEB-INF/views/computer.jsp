<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- computer 호출했을 때 결과 담는 곳 -->
<table border="1">
  <tr>
    <th>항목명</th>
    <th>가격</th>
  </tr>
  <tr>
    <td>${vo.com}</td>
    <td>${vo.price}</td>
  </tr>
  <tr>
    <td>${vo.mouse}</td>
    <td>${vo.price2}</td>
  </tr>
  <tr>
    <td>총합계</td>
    <td>${vo.sum}</td>
  </tr>
</table>

