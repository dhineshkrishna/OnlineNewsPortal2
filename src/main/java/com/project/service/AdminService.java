package com.project.service;

import java.util.List;
import java.util.Optional;

//import org.springframework.http.ResponseEntity;

import com.project.model.AdminModel;

public interface AdminService {
	public abstract List<AdminModel> getvalue();
	public abstract Optional<AdminModel> findById(int id);
	public abstract String postadmin(AdminModel admins);
	public abstract String putadmin(AdminModel admins);
	public abstract Optional<Object> deleteadmin(int id);
//	public abstract void normalMail(String toEmail, String body, String subject);
}
