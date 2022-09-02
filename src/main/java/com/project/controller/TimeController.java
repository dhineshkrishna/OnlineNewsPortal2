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

import com.project.ServiceImpl.TimeServImpl;
import com.project.model.TimeModel;
@RestController
public class TimeController {
	@Autowired
	TimeServImpl times;

	@GetMapping("/time_get")
	public List<TimeModel> gettimes(){

		return  times.gettime();
	}

	@PostMapping("/time_post")
	public String posttimes(@RequestBody TimeModel timer) {
		
		return  times.posttime(timer);
	}

	@PutMapping("/time_put")
	public String puttimes(@RequestBody TimeModel timer) {
		if(timer==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  times.puttime(timer);
	}

	@DeleteMapping("/time_delete/{id}")
	public String deletetimes(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  times.deletetime(id);
	}

//	@PatchMapping("/time_patchbyid/{id}")
//	public ResponseEntity<?> savetimes(@RequestBody TimeModel timer,
//			@PathVariable("id") int id){
//		if(timer==null) {
//			throw new IllegalArgumentException("Invalid data input");
//		}
//		return  times.savetime(timer, id);
//	}

}
