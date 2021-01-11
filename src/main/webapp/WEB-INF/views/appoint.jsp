<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오호병원</title>
<!-- css 필수항목 -->
  <link href="resources/css/main.css" rel="stylesheet">
<link href="resources/css/menu.css" rel="stylesheet">

<link href="resources/css/homedoctor.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	   /*
	   var s = document.getElementById("busershow");
	   var busershow = s.options[s.selectedIndex].value;
	   var buserField = $("#busershow option:selected").val();
	   */
	   
	   $("#showDoctor").empty();
	  
	   
	   $("#busershow").change(aa);
	});
	
function aa(){
	$("#showDoctor").empty();
	
	$.ajax({
	      type:"get",
	      url:"doctor",
	      dataType:"json",
	      success:function(doctors){
	         
	         var list = doctors.datas;
	         var str = "<td>의사명";
	         str +=	"<select id='doctorshow' name='doctorshow'>";
	         $(list).each(function(idx, objArr){
	        	//alert(objArr.d_name);
	        	str +="<option name='d_class' value='${objArr.d_name}'>"+objArr["d_name"]+"</option>";
	         });
	        str +=	"</select>";
	         //alert("c");
	         str += "</td>";
	         $("#showDoctor").append(str);
	         
	         
	      },
	      error:function(){
	         $("#showDoctor").text("에러발생 ");
	      }
	   });
}
</script>
</head>
<body>
<%@ include file="main_top.jsp" %>
<br><br><br><br><br><br><br><br><br><br>
<table style="align-content: center; margin-left: auto; margin-right: auto;">
<tr>
	<td align="center">
			<table border="1">
				<tr align="center" style="background-color: #556677">
					<td colspan="4">
					<b style="color: #FFFFFF">예약하기</b>
					</td>
				</tr>
				<tr>			
					<td>진료과
					<select id="busershow" name="busershow">
						<c:forEach var="b" items="${classdatas}">
						<option name="c_class" value="${b.c_class}">${b.c_class}</option>
						</c:forEach>
					</select>
					</td>
					<td><div id="showDoctor">
					<select id='doctorshow' name='doctorshow'>
					</select>
					</div>
					</td>
					<td>날짜선택
						<select name="calendar">
						<option value="0">달력이들어갈거에요
						<option value="">
						</select>
					</td>
				</tr>
				<tr>
					<td>환자이름<input type="text" name="name" size="15" value=""></td>
					<td>연락처<input type="text" name="phone" size="15" value=""></td>
					<td>생년월일<input type="text" name="birth" size="15" value=""></td>
				</tr>
				<tr>
					<td>진료과<input type="text" name="c_class" size="15" value="$("#busershow option:selected").val()"></td>
					<td>담당의<input type="text" name="d_name" size="15" value=""></td>
					<td>진료날짜<input type="text" name="day" size="15" value=""></td>
				</tr>
				<tr>
					<td>진료시간<input type="text" name="time" size="15" value=""></td>
				</tr>
				<tr>
					<td colspan="4" style="text-align: center;">
					  	<input type="hidden" name="td_dn" value="의사번호">
  						<input type="hidden" name="td_pn" value="환자번호">
						<input type="button" value="예약하기" id="btnSubmit">&nbsp;&nbsp;
						<input type="button" value="목록" onclick="환자 예약 등록확인 창으로 이동">
					</td>
				</tr>
				

				
		</table>
	</td>
</table>	
	<br><br><br><br><br><br><br><br><br><br><br>
<!-- 하단 필수항목 -->
<%@ include file="main_bottom.jsp" %>

<script type="text/javascript" src="resources/js/main.js"></script>
<script type="text/javascript" src="resources/js/menu.js"></script>
</body>
</html>