package com.project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.model.UserModel;
import com.project.repository.UserRepo;
import com.project.service.UserService;
@Service
public class UserServImpl implements UserService{
@Autowired
UserRepo userrepository;
	@Override
	public List<UserModel> getuser() {
		List<UserModel> list=userrepository.findAll();
		return list;
	}

	@Override
	public String postuser(UserModel user) {
		userrepository.save(user);
		return "posted";
	}

	@Override
	public String deleteuser(int id) {
		userrepository.deleteById(id);
		return "deleted";
	}

	@Override
	public ResponseEntity<?> saveuser(UserModel user, int id) {
		userrepository.save(user);
		return ResponseEntity.ok("resource saved");
	}

}
