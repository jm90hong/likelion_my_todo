$(document).ready(function(){
	
	$('#submit-btn').on('click',function(){
		
		
		var id = $('#id').val();
		var pw = $('#pw').val();
		var pwCheck = $('#pw-check').val();
		var nickname = $('#nickname').val();
		
		
		if(id.length==0){
			alert('아이디를 입력하세요');
			return;
		}
		
		if(pw.length==0){
			alert('비밀번호를 입력하세요');
			return;
		}
		
		if(nickname.length==0){
			alert('닉네임을 입력하세요');
			return;
		}
		
		if(pw != pwCheck){
			alert('비밀번호가 일치하지 않습니다.');
			return;
		}
		
		
		
		
	
		$.ajax({
			url:'./user/create',
			type:'post',
			data:{
				id:id,
				pw:pw,
				nn:nickname
			},
			success:function(response){
				if(response=='ok'){
					alert('회원가입 완료');
					location.replace('./login');
				}else if(response=='id'){
					alert('이미 가입된 아이디가 존재합니다.');
				}else if(response=='nickname'){
					alert('이미 가입된 닉네임이 존재합니다.');
				}
			},
			error:function(err){
				
			}
		});
		
	});
	
	
});


