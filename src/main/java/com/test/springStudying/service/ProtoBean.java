package com.test.springStudying.service;

import java.time.LocalDateTime;

public class ProtoBean {

	private String currentTime = LocalDateTime.now().toString();
	
	
	public String getTime() {
		return currentTime;
	}
}
