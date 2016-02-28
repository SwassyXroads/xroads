package com.xroads.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterRequest {
	
	@JsonProperty("username")
	private String username;
	@JsonProperty("password")
	private String password;
	@JsonProperty("mobile")
	private Integer mobile;
	@JsonProperty("email")
	private String email;
	
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Integer getMobile() {
		return mobile;
	}
	public String getEmail() {
		return email;
	}
	
	

}
