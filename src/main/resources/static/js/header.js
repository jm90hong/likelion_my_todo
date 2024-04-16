$(document).ready(function(){
	
	
	
	$('.logo').on('click',function(){
		location.href='./';
	});
	
	$('#go-login-btn').on('click',function(){
		location.href='./login';
	});
	
	$('#go-create-todo-btn').on('click',function(){
		location.href='./create-todo';
	});
	
	$('#go-create-user-btn').on('click',function(){
		location.href='./create-user';
	});
	
	$('#logout-btn').on('click',function(){
		
		var con = confirm('정말 로그아웃 하시겠습니까');
		if(!con){
			return;
		}
		
		$.ajax({
			url:'./user/logout',
			type:'post',
			data:{},
			success:function(response){
				if(response=='ok'){
					alert('로그아웃 되었습니다.');
					location.replace('./');
				}
			},
			error:function(err){
				
			}
		});
	});
	
	
	
	
	
	
});


