<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오호병원</title>
<!-- css 필수항목 -->
  <link href="resources/css/main.css" rel="stylesheet">
<link href="resources/css/menu.css" rel="stylesheet">

<link href="resources/css/homedoctor.css" rel="stylesheet">
</head>
<body>
<%@ include file="main_top.jsp" %>
<br>
<form action="insert" method="post">
<table border="1">
	<tr>
		<th>진료과</th>
			<td>
			<input type="text" name="d_class">
			</td>
		<th>담당의</th>
			<td>
			<input type="text" name="d_name">
			</td>
	</tr>
	<tr>
		<th>환자명</th>
			<td>
			<input type="text" name="p_name">
			</td>
		<th>생년월일</th>
			<td>
			<input type="text" name="p_birth">
			</td>
	</tr>
	<tr>
		<th>복용약</th>
			<td>
			<input type="text" name="tp_medicine">
			</td>
		<th>체온</th>
			<td>
			<input type="text" name="tp_tem">
			</td>
	</tr>
	<tr>
		<th>증상</th>
			<td>
			<textarea rows="40" cols="80" name="tp_content"></textarea>
			</td>
	</tr>
	<tr>
  	<td colspan="2" style="text-align: center;">
  		<input type="hidden" name="td_dn" value="${dto.td_dn }">
  		<input type="hidden" name="td_pn" value="${dto.td_dn }">
  		<input type="submit" value="등록">
  		<input type="button" value="목록" onclick="location.href='tpboard?page=1'">
  	</td>
  </tr>
</table>
</form>

<br>
<!-- 하단 필수항목 -->
<%@ include file="main_bottom.jsp" %>

<script type="text/javascript" src="resources/js/main.js"></script>
<script type="text/javascript" src="resources/js/menu.js"></script>
</body>
</html>