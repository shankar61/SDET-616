package com.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.model.User;
import com.ms.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		
		User usr = userService.saveUser(user);
		System.out.println("User Data : " + user);
		return usr;

	}
	
	@GetMapping("/get")
	public List<User> getUser(){
		return userService.get();
	}
	
	@GetMapping("/getById/{userId}")
	public User getUserById(@PathVariable Integer userId) {
	return userService.getByid(userId);
	}
	
	@PutMapping("/update/{userId}")
	public User updateUser(@PathVariable Integer userId,@RequestBody User user) {
		return userService.userUpdate(userId,user);
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		 userService.deleteUsr(userId);
	}

}
