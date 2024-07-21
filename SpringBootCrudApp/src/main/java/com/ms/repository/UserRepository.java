package com.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.model.User;

public interface UserRepository extends JpaRepository<User, Integer >{

}
