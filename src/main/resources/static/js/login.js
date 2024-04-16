$(document).ready(function(){
	
	$('#submit-btn').on('click',function(){
		
		
		var id = $('#id').val();
		var pw = $('#pw').val();
		
		
		
		if(id.length==0){
			alert('아이디를 입력하세요');
			return;
		}
		
		if(pw.length==0){
			alert('비밀번호를 입력하세요');
			return;
		}
		
	
		
		$.ajax({
			url:'./user/login',
			type:'post',
			data:{
				id:id,
				pw:pw
			},
			success:function(response){
				if(response != ''){
					alert(`${response.nickname} 님 안녕하세요.`);
					location.replace('./');
				}else{
					alert('일치하는 계정이 없습니다.');
				}
			},
			error:function(err){
				
			}
		});
		
	});
	
	
});


