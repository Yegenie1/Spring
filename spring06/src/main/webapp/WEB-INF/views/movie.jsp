<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- computer 호출했을 때 결과 담는 곳 -->
<table border=1>
  <tr style="background: yellow">
    <th>영화제목</th>
    <th>영화가격</th>
  </tr>
  <tr style="background: pink">
    <td>${vo.title}</td>
    <td>${vo.price}</td>
  </tr>
  <tr>
    <td colspan="2"><a href="aaa">문자인증받기</a></td>
  </tr>
</table>

