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

import com.project.ServiceImpl.NewsServImpl;
import com.project.model.NewsModel;
@RestController
public class NewsController {
	@Autowired
	NewsServImpl newsese;

	@GetMapping("/news_get")
	public List<NewsModel> getnewses(){

		return  newsese.getnews();
	}

	@PostMapping("/news_post")
	public String postnewses(@RequestBody NewsModel news) {
		
		return  newsese.postnews(news);
	}

	@PutMapping("/news_put")
	public String putnewses(@RequestBody NewsModel news) {
		if(news==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  newsese.putnews(news);
	}

	@DeleteMapping("/news_delete/{id}")
	public String deletenewses(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  newsese.deletenews(id);
	}

	@PatchMapping("/news_patchbyid/{id}")
	public ResponseEntity<?> savenewses(@RequestBody NewsModel news,
			@PathVariable("id") int id){
		if(news==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  newsese.savenews(news, id);
	}

}
