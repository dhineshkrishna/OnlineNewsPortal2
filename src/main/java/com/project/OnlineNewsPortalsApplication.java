package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;

import com.project.ServiceImpl.AdminServImpl;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class OnlineNewsPortalsApplication {
    @Autowired
    AdminServImpl service;
	public static void main(String[] args) {
		SpringApplication.run(OnlineNewsPortalsApplication.class, args);
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void mess()
//	{
//		service.normalMail("dondhinesh037@gmail.com", "Job Welcome", "I have seen the post of your company");
//	}

}
