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
		
		
		<input type="hidden" value="${todo.todo_idx}" id="this-todo-idx"/>
		<div style="margin:0 auto;margin-top:100px;width:280px;display: flex;flex-direction: column">
			<div class="page-title">TODO</div>
			<span class="text-1">내용</span>
			<span class="text-2">${todo.title}</span>
			
			<span class="text-1">등록날짜</span>
			<span class="text-2">${todo.created_date}</span>
			
			<button id="complete-btn" class="btn-long">완료하기</button>
			<button id="delete-btn" class="btn-long" style="margin-top:10px;">삭제하기</button>
		</div>
	</div>
	
	

</body>

<script src="./js/detail-todo.js"></script>
</html>