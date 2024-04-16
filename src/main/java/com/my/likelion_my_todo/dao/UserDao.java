package com.my.likelion_my_todo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.likelion_my_todo.vo.User;

@Service
public class UserDao {
	
	
	@Autowired
	SqlSession s;
	
	
	
	public int save(User user) {
		return s.insert("UserMapper.save",user);
	}
	
	
	
	public User findByIdAndPw(User user) {
		return s.selectOne("UserMapper.findByIdAndPw",user);
	}
	
	
	public User findById(String id) {
		return s.selectOne("UserMapper.findById",id);
	}
	
	public User findByNickname(String nickname) {
		return s.selectOne("UserMapper.findByNickname",nickname);
	}
}
