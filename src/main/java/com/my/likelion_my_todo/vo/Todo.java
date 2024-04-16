package com.my.likelion_my_todo.vo;

public class Todo {

	
	private int todo_idx=0;
	private int user_idx=0;
	private String title=null;
	private String completed_ny=null;
	private String created_date=null;
	
	
	public int getTodo_idx() {
		return todo_idx;
	}
	public void setTodo_idx(int todo_idx) {
		this.todo_idx = todo_idx;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompleted_ny() {
		return completed_ny;
	}
	public void setCompleted_ny(String completed_ny) {
		this.completed_ny = completed_ny;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
	
	
	
}
