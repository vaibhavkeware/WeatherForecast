package com.example.demo.jwtsecurity;

import org.springframework.stereotype.Component;



@Component
public class JWTRequest {

	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JWTRequest [username=" + username + ", password=" + password + "]";
	}

	public JWTRequest(String username, String password) {
		
		this.username = username;
		this.password = password;
	}

	public JWTRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
