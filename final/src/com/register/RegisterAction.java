package com.register;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class RegisterAction {
	
	private String name, email, userName, password; 
	private int id;
	
	

	public String execute() {  
	    int i = RegisterDao.save(this);
		
	    
	    if(i > 0) { 
	    	
	    return "success";  
	    }  
	    return "error";  
	}
	
	public int getId() {
		return id;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}




