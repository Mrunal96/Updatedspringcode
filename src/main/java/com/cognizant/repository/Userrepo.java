package com.cognizant.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.model.User;



public interface Userrepo extends CrudRepository<User, Integer>{
	   public Iterable<User> deleteById(int cognizantemployeeid);
	   public User findById(int cognizantemployeeid);
	}