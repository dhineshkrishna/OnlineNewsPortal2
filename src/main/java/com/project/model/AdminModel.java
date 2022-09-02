package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminModel {
	@Id
	@GeneratedValue
	
	public int user_id;
	private String users;
	private String passwords;
	private String emails;
	private String status;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public String getEmails() {
		return emails;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AdminModel() {
		super();
	}
	public AdminModel(int user_id, String users, String passwords, String emails, String status) {
		super();
		this.user_id = user_id;
		this.users = users;
		this.passwords = passwords;
		this.emails = emails;
		this.status = status;
	}
	public AdminModel(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

}
