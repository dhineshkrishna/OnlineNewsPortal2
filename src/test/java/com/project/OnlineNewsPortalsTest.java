package com.project;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.model.AdminModel;
import com.project.repository.AdminRepo;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OnlineNewsPortalsTest {
	
	
	@Autowired
	AdminRepo adminRepo;
	
	@Test
	public void contextLoad() {
		
	}
	
	@Test
	public void testSave() {
		AdminModel admin= new AdminModel(1,"Gune","mani","dine","maan");
		adminRepo.save(admin);
		Assert.assertEquals(admin, admin);
		
	}

}
