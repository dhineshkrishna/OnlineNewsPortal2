package com.project.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.project.model.AdminModel;
import com.project.repository.AdminRepo;
import com.project.service.AdminService;

@Service
public class AdminServImpl implements AdminService{

	@Autowired
	AdminRepo reposit;
	
//	@Autowired
//    private JavaMailSender mail;
	
	@Override
	public List<AdminModel> getvalue() {
		List<AdminModel> list=reposit.findAll();
		return list;
	}

	@Override
	public String postadmin(AdminModel admins) {
		if(admins.getUser_id()==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		reposit.save(admins);
		return "posted";
	}

	@Override
	public String putadmin(AdminModel admins) {
		reposit.save(admins);
		return "putted";
	}

	@Override
	public Optional<Object> deleteadmin(int id) {
		reposit.deleteById(id);
		return Optional.ofNullable("deleted");
	}


	public Optional<AdminModel> findById(int id) {
		return reposit.findById(id);
	}
	
//	public void normalMail(String toEmail, String body, String subject) {
//		SimpleMailMessage message=new SimpleMailMessage();
//		message.setFrom("birunesh@gmail.com");
//		message.setTo(toEmail);
//		message.setText(body);
//		message.setSubject(subject);
//		
//		mail.send(message);
//		System.out.println("Mail sent");
//	}

}
