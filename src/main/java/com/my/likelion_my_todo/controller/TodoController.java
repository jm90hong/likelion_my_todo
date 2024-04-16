package com.my.likelion_my_todo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.likelion_my_todo.service.TodoService;
import com.my.likelion_my_todo.vo.Todo;
import com.my.likelion_my_todo.vo.User;

@RestController
@RequestMapping(value="todo")
public class TodoController {

	
	
	
	@Autowired
	TodoService todoService;
	
	
	@GetMapping("all")
	public List<Todo> all(){
		
		List<Todo> list = todoService.findAll();
		
		return list;
	}
	
	
	@PostMapping("create")
	public String save(
				@RequestParam(value="title") String title,
				HttpSession session
			) {
		
		
		User me = (User) session.getAttribute("me");
		
		Todo todo = new Todo();
		todo.setTitle(title);
		todo.setUser_idx(me.getUser_idx());
		
		
		todoService.save(todo);
		
		return "ok";
	}
	
	
	
	@PostMapping("delete")
	public String delete(
				@RequestParam(value="todo_idx") int todo_idx
			) {
		
		todoService.delete(todo_idx);
		
		return "ok";
	}
	
	
	
	
	@PostMapping("complete")
	public String complete(
				@RequestParam(value="todo_idx") int todo_idx
			) {
		
		Todo todo =  new Todo();
		todo.setTodo_idx(todo_idx);
		todo.setCompleted_ny("y");
		
		todoService.updateComplete(todo);
		
		return "ok";
	}
	
	
		
}
