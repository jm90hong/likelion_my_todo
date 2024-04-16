$(document).ready(function(){
	
	
	
	
	$(document).on('click','tr',function(){
		
		var todoIdx = $(this).data('todo-idx');
		location.href='./detail-todo?todo_idx='+todoIdx;
		
	});
	
	
	$.ajax({
		url:'./todo/all',
		type:'get',
		data:{},
		success:function(todos){
			
			
			$.each(todos,function(index, todo){
				$('tbody').append(`
					<tr data-todo-idx="${todo.todo_idx}">
				      <th scope="row">${todo.todo_idx}</th>
				      <td>${todo.title}</td>
				      <td>${todo.completed_ny=='y' ? '완료' : '미완료'}</td>
				      <td>${todo.created_date}</td>
				    </tr>
				
				
				`);
			});
			
			
		},
		error:function(err){
			
		}
	})
	
	
	
});



