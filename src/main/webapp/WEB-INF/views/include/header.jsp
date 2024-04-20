<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     


<script src="./js/header.js"></script>    




<header>
	<div class="inner">
		<img class="logo" src="./image/logo.png"/>
		
		
		<div>
			
			
			<c:if test="${empty sessionScope.me}">
				<button id="go-login-btn" class="btn-mini">로그인</button>
				<button id="go-create-user-btn" class="btn-mini">회원가입</button>
			</c:if>
			
			<c:if test="${not empty sessionScope.me}">
				<span>${sessionScope.me.nickname} 님</span>
				<button id="go-create-todo-btn" class="btn-mini">TODO 등록</button>
				<button id="logout-btn" class="btn-mini">로그아웃</button>
			</c:if>
			
		</div>
		
		
		
	</div>
	
</header>