$(document).ready(function(){
	var thisTodoIdx = $('#this-todo-idx').val();
	
	//완료
	$('#complete-btn').on('click',function(){
		
		var con = confirm('완료 하시겠습니까?');
		if(!con){
			return;
		}
		
		
		$.ajax({
			url:'./todo/complete',
			type:'post',
			data:{
				todo_idx:thisTodoIdx
			},
			success:function(response){
				if(response=='ok'){
					alert('완료 되었습니다.');
					location.replace('./');
				}
			},
			error:function(err){}
		});
		
	});
	
	//삭제
	$('#delete-btn').on('click',function(){
		
		var con = confirm('삭제 하시겠습니까?');
		if(!con){
			return;
		}
		
		$.ajax({
			url:'./todo/delete',
			type:'post',
			data:{
				todo_idx:thisTodoIdx
			},
			success:function(response){
				if(response=='ok'){
					alert('삭제 되었습니다.');
					location.replace('./');
				}
			},
			error:function(err){}
		});
		
	});
	
});


