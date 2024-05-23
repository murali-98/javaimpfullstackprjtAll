package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMVC {
	
	@GetMapping("/")
	public String getName() {
		return "home.jsp";
	}
	
	@PostMapping(value="/addCustomer")
	public String addCustomer(@RequestParam String fn, @RequestParam String ln,@RequestParam String e , Model model) {
	//System.out.println(firstName+" "+lastName+" "+email);
		model.addAttribute("firstname",fn);
		model.addAttribute("lastname",ln);
		model.addAttribute("email",e);
		return "success.jsp";
		}

}
