package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {	
	
	private AuthenticationService authenticationService;	
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)	
	public String goToLoginPage() {				
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)	
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map) {		
		map.put("name", name);		
		
		if(authenticationService.authenticate(name, password)) {
			return "welcome";
		}
		
		map.put("errorMsg", "Invalid Credentials! Please try again.");
		return "login";
	}
}
