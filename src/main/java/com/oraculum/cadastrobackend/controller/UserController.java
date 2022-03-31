package com.oraculum.cadastrobackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oraculum.cadastrobackend.entity.User;
import com.oraculum.cadastrobackend.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	 
	@Autowired
	 private UserService service;
	 
	@PostMapping
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }
	 
	@GetMapping
    public List<User> findAllUsers() {
		return service.getUsers();
    }
}
