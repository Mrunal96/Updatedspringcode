package com.cognizant.controller;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.User;
import com.cognizant.service.Userservice;

@RestController
public class HomeController {
	
	@Autowired
	private Userservice service;
	
	@GetMapping("/hi")
	public String Hello() {
		return "Hi";
	}
	
	@PostMapping("/save-user")
	@Transactional
	@CrossOrigin
    public String registerUser(@RequestBody User user) {
	service.saveUser(user);
	return "Hello "+user.getProjectname()+" Members,Your data has been saved!!!";
	}
	
	@GetMapping("/all-users")
	@CrossOrigin
	public Iterable<User> showAllUser(User user){
		return service.showAllUsers();
	}
	
	@GetMapping("delete-user/{cognizantemployeeid}")
	@Transactional
	@CrossOrigin
     public Iterable<User> deleteUser(@PathVariable int cognizantemployeeid){
		return service.deleteById(cognizantemployeeid);
	}
	
	@GetMapping("/find-users/{cognizantemployeeid}")
	@CrossOrigin
	public User findAllUser(@PathVariable int cognizantemployeeid){
		return service.findById(cognizantemployeeid);
	}
	
	/*
	 * @PutMapping("/update-user")
	 * 
	 * @Transactional
	 * 
	 * @CrossOrigin public String UpdateUser(@RequestBody User user) {
	 * service.saveUser(user); return
	 * "Hello "+user.getProjectname()+" members, your information has been updated";
	 * }
	 */

	@PutMapping("/update")
	public User Update(@RequestBody User user) {
		return service.update(user);
	}
  }
 


