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
		
		
		<div style="margin:0 auto;margin-top:100px;width:280px;display: flex;flex-direction: column">
			<div class="page-title">TODO 등록</div>
			<input id="title" class="form-inp" placeholder="내용"/>
			
			
			<button id="submit-btn" class="btn-long">등록하기</button>
		</div>
	</div>
	
	

</body>
<script src="./js/create-todo.js"></script>
</html>