package com.wow.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String Loign()
	{
		return "login";
	}
	
	@RequestMapping("home")
	public String Home()
	{
		return "home";
	}
	
	@RequestMapping("/add_school_view")
	public String AddSchollView()
	{
		return "add_school_view";
	}

	@RequestMapping("/add_class_view")
	public String AddClassView()
	{
		return "add_class_view";
	}
}
