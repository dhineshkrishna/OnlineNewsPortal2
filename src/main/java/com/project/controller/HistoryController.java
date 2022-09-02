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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ServiceImpl.HistoryServImpl;
import com.project.model.HistoryModel;
@RestController
public class HistoryController {
	@Autowired
	HistoryServImpl historyy;

	@GetMapping("/history_get")
	public List<HistoryModel> gethistories(){

		return  historyy.gethistory();
	}

	@PostMapping("/history_post")
	public String posthistories(@RequestBody HistoryModel history) {
		
		return  historyy.posthistory(history);
	}

	@PutMapping("/history_put")
	public String puthistories(@RequestBody HistoryModel history) {
		if(history==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  historyy.puthistory(history);
	}

	@DeleteMapping("/history_delete/{id}")
	public String deletehistories(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  historyy.deletehistory(id);
	}

	@PatchMapping("/history_patchbyid/{id}")
	public ResponseEntity<?> save(@RequestBody HistoryModel history,
			@PathVariable("id") int id){
		if(history==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  historyy.savehistory(history, id);
	}

}
