package com.my.likelion_my_todo.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.likelion_my_todo.service.UserService;
import com.my.likelion_my_todo.vo.User;

@RestController
@RequestMapping(value="user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	@PostMapping("create")
	public String save(
				@RequestParam(value="id") String id,
				@RequestParam(value="pw") String pw,
				@RequestParam(value="nn") String nickname
			) {
		
		
		
		String code =  UUID.randomUUID().toString();
		
		User user = new User();
		user.setUser_code(code);
		user.setId(id);
		user.setPw(pw);
		user.setNickname(nickname);
		
		
		
		User u1 = userService.findById(id);
		if(u1 !=null) {
			return "id";
		}
		
		
		
		User u2 = userService.findByNickname(nickname);
		if(u2 !=null) {
			return "nick";
		}
		
		
		userService.save(user);
		return "ok";
	}
	
	
	@PostMapping("login")
	public User login(
				@RequestParam(value="id") String id,
				@RequestParam(value="pw") String pw,
				HttpSession session
			) {
		
		
		
		
		User user = new User();
		user.setId(id);
		user.setPw(pw);
		
		
		User result = userService.findByIdAndPw(user);
		
		if(result!=null) {
			session.setAttribute("me", result);
		}
		
		return result;
		
		
	}
	
	
	
}
