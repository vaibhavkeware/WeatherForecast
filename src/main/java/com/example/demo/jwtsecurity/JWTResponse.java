package com.example.demo.jwtsecurity;

import org.springframework.stereotype.Component;

import java.lang.String;

@Component
public class JWTResponse {
	
	private String jwtToken;
	
	private String username;
	
	@Override
	public String toString() {
		return "JWTResponse [jwtToken=" + jwtToken + ", username=" + username + "]";
	}
	
	public JWTResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JWTResponse(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}




}
