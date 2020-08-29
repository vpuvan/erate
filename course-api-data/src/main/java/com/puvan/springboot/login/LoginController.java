package com.puvan.springboot.login;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginPage() {
		
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String loginOut() {
		
		return "logout.jsp";
	}
	
	public Principal user(Principal principal) {
		return principal;
	}
	

}
