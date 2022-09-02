package com.project.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.ServiceImpl.AdminServImpl;
import com.project.model.AdminModel;

@RestController
public class AdminController {
	@Autowired
	AdminServImpl admin;

	@GetMapping("/admin_get")
	public List<AdminModel> getusers(){

		return admin.getvalue();
	}

	@PostMapping("/admin_post")
	public String postusers(@RequestBody AdminModel admins) {
		
		return admin.postadmin(admins);
	}

	@PutMapping("/admin_put")
	public String putusers(@RequestBody AdminModel admins) {
		if(admins==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return admin.putadmin(admins);
	}

	@DeleteMapping("/admin_delete/{id}")
	public Optional<Object> deleteusers(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return admin.deleteadmin(id);
	}

	
    @PostMapping("/admin_postbyid/{id}")
    public Optional<AdminModel> post(@PathVariable ("id") int id){
    	return admin.findById(id);
    }

}

