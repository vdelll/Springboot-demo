package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagesController {

	@GetMapping("/")
	public String home(@RequestParam(required = false, defaultValue = "World") String name, ModelMap modelMap) {
	
		modelMap.put("name", name);
		
		return "pages/home";
	}

}
