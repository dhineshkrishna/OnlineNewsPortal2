package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ServiceImpl.UserServImpl;
import com.project.model.UserModel;

@RestController
public class UserController {
	@Autowired
	UserServImpl users;

	@GetMapping("/users_get")
	public List<UserModel> getusers(){

		return  users.getuser();
	}

	@PostMapping("/users_post")
	public String postusers(@RequestBody UserModel user) {
		
		return  users.postuser(user);
	}


	@DeleteMapping("/users_delete/{id}")
	public String deleteusers(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  users.deleteuser(id);
	}
}
