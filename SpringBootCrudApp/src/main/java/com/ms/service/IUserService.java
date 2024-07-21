package com.ms.service;

import java.util.List;


import com.ms.model.User;

public interface IUserService {
	
	public User saveUser(User user);

	public List<User> get();

	public User getByid(Integer userId);

	public User userUpdate(Integer userId, User user);

	public void deleteUsr(Integer userId);

	

	

}
