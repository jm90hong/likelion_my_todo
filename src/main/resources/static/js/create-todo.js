$(document).ready(function(){
	
	
	
	
	$('#submit-btn').on('click',function(){
		
		
		var title = $('#title').val();
		
		if(title.length==0){
			alert('내용을 적어주세요.');
			return;
		}
		
		$.ajax({
			url:'./todo/create',
			type:'post',
			data:{
				title:title
			},
			success:function(response){
				if(response=='ok'){
					alert('등록 완료');
					location.replace('./');
				}
			},
			error:function(err){
				
			}
			
		})
		
	});
	
	
	
	
});


