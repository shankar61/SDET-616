package com.ms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.model.User;
import com.ms.repository.UserRepository;

import com.ms.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User usr=userRepository.save(user);
		return usr;
	}

	@Override
	public List<User> get() {
		return userRepository.findAll();
	}

	@Override
	public User getByid(Integer userId) {
		Optional<User> u = userRepository.findById(userId);
		return u.get();
	}

	@Override
	public User userUpdate(Integer userId, User user) {
		Optional<User> u = userRepository.findById(userId);
		if(u.isPresent()) {
			User usr = u.get();
			usr.setUserName(user.getUserName());
			usr.setUserAddress(user.getUserAddress());
			return userRepository.save(usr);			
		}
		else
			return null;
	}

	@Override
	public void deleteUsr(Integer userId) {
		 userRepository.deleteById(userId);
	}

}
