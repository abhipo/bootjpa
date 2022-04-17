package com.webapp.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Aliencontroller 
{
	@RequestMapping("/")
public String home() 
	{
	
		return "home.jsp";
	}
}
