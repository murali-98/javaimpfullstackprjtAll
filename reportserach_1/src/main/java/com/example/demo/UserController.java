package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController 
{
	@Autowired
	
	UserDao dao;
	
	
	@GetMapping("/")
	public String index()
	{
		return "login";
		
	}
	@PostMapping("/dashboard")
	public String home(HttpServletRequest req,Model m)
	{
		String usern=req.getParameter("username");
		String pass=req.getParameter("passwrd");
		boolean un=dao.existsByUsername(usern);
		boolean passw=dao.existsByPasswrd(pass);
		if(un==true && passw==true)
		{
		return "dashboard";
		}
		else
		{
			String msg1= "Invalid Credentials";
			m.addAttribute("message",msg1);
			return "login";
			
		}
		
		
	}
	@RequestMapping("/application")
	public String appli() {
		return "application";
	}
	@RequestMapping("/login")
	public String applio() {
		return "login";
	}
	@RequestMapping("/about")
	public String applion() {
		return "about";
	}
	@RequestMapping("/add")
	public String add(){
		return "add";
	}
	@PostMapping("/process")
	public String add1(){
		return "process";
	}
	@RequestMapping("/update")
	public String update(){
		return "update";
	}
	@PostMapping("/update-process")
	public String update1(){
		return "update-process";
	}
	@RequestMapping("/delete")
	public String delete(){
		return "delete";
	}
}