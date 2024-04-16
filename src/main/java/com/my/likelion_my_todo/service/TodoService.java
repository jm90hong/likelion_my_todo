package com.my.likelion_my_todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.likelion_my_todo.dao.TodoDao;
import com.my.likelion_my_todo.vo.Todo;

@Service
public class TodoService {

	
	@Autowired
	TodoDao todoDao;
	
	
	public int save(Todo todo) {
		return todoDao.save(todo);
	}
	
	public Todo findByIdx(int todo_idx) {
		return todoDao.findByIdx(todo_idx);
	}
	
	public List<Todo> findAll() {
		return todoDao.findAll();
	}
	
	public int delete(int todo_idx) {
		return todoDao.delete(todo_idx);
	}
	
	public int updateComplete(Todo todo) {
		return todoDao.updateComplete(todo);
	}
	
	
}
