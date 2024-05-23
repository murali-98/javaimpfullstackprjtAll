package com.dxc.springMVC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.springMVC.model.User;
import com.dxc.springMVC.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
    public UserService userService;
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());
		return mav;
	}
	
	@RequestMapping(value="/registerProcess",method = RequestMethod.POST)
	public ModelAndView adduser(HttpServletRequest request,HttpServletResponse response , @ModelAttribute("user") User user){
		userService.register(user);
		return new ModelAndView("Welcome","firstname",user.getFirstname());
		
		
	}
}