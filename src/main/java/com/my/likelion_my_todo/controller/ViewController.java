package com.my.likelion_my_todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.likelion_my_todo.service.TodoService;
import com.my.likelion_my_todo.vo.Todo;

@Controller
public class ViewController {

	
	
	@Autowired
	TodoService todoService;
	
	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/create-user")
	public String createUser() {
		
		return "create-user";
	}
	
	@GetMapping("/create-todo")
	public String createTodo() {
		
		
		return "create-todo";
	}
	
	
	@GetMapping("/detail-todo")
	public String detailTodo(
				@RequestParam(value="todo_idx") int todo_idx,
				Model model
			) {
		
		Todo todo = todoService.findByIdx(todo_idx);
		
		model.addAttribute("todo",todo);
		
		return "detail-todo";
	}
	
	
	
}
