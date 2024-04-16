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
		
		
		
		<div style="margin:0 auto;margin-top:100px;width:280px;display: flex;flex-direction: column">
			<div class="page-title">로그인</div>
			<input id="id" class="form-inp" placeholder="아이디"/>
			<input id="pw" type="password" class="form-inp" placeholder="비밀번호"/>
			
			
			<button  id="submit-btn" class="btn-long">로그인</button>
		</div>
	</div>
	
	

</body>
<script src="./js/login.js"></script>
</html>