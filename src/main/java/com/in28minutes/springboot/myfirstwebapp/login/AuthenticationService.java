package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = "in28minutes".equals(username);
		boolean isValidPassword = "dummy".equals(password);
		
		return isValidUserName && isValidPassword;	
	}
}
