package com.xroads.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {
	@JsonProperty("mobileNo")
	private Integer mobileNo;
	@JsonProperty("password")
	private String password;
	public Integer getMobileNo() {
		return mobileNo;
	}
	public String getPassword() {
		return password;
	}
	
	
}
