package com.vinay.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.crud.model.User;
import com.vinay.crud.repo.UserRepo;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	private List<User> users;
	
	@GetMapping("/all")
	public List<User> getAll() {
		return users =  userRepo.findAll();
		
	}
	
	@GetMapping("/{name}")
	public Optional<User> getByName(@PathVariable String name) {
		System.out.println("getting id"+name);
		if(users != null) {
			System.out.println("entered");
		return users.stream().filter(x -> x.getName().equals(name)).findFirst();
		}
		return null;
	}
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userRepo.save(user);
	}

}
