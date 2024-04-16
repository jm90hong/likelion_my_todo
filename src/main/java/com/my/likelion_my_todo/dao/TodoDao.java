package com.my.likelion_my_todo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.likelion_my_todo.vo.Todo;

@Service
public class TodoDao {

	
	@Autowired
	SqlSession s;
	
	
	public int save(Todo todo) {
		return s.insert("TodoMapper.save",todo);
	}
	
	
	public Todo findByIdx(int todo_idx) {
		return s.selectOne("TodoMapper.findByIdx",todo_idx);
	}
	
	
	public List<Todo> findAll() {
		return s.selectList("TodoMapper.findAll");
	}
	
	
	public int delete(int todo_idx) {
		return s.delete("TodoMapper.delete",todo_idx);
	}
	
	public int updateComplete(Todo todo) {
		return s.update("TodoMapper.updateComplete",todo);
	}
	
}
