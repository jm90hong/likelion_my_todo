package com.my.likelion_my_todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.likelion_my_todo.dao.UserDao;
import com.my.likelion_my_todo.vo.User;

@Service
public class UserService {
	
	
	@Autowired
	UserDao userDao;
	
	
	
	public int save(User user) {
		return userDao.save(user);
	}
	
	
	
	public User findByIdAndPw(User user) {
		return userDao.findByIdAndPw(user);
	}
	
	
	public User findById(String id) {
		return userDao.findById(id);
	}
	
	public User findByNickname(String nickname) {
		return userDao.findByNickname(nickname);
	}
	
	
}
