<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 일정 관리</title>

<%@ include file="/WEB-INF/views/include/lib.jsp" %>

</head>
<body>
	
	
	<div class="page-container">
		<%@ include file="/WEB-INF/views/include/header.jsp" %>
		
		
		<div style="margin-top:30px;">
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">고유번호</th>
			      <th scope="col">제목</th>
			      <th scope="col">완료여부</th>
			      <th scope="col">등록날짜</th>
			    </tr>
			  </thead>
			  <tbody>
			   
			  </tbody>
			</table>
		</div>
		
		
	</div>
	
	

</body>
<script src="./js/home.js"></script>
</html>