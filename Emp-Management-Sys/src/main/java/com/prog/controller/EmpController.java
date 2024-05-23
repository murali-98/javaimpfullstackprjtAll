package com.prog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prog.entity.Employee;
import com.prog.entity.LoginForm;
import com.prog.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService service;
	@RequestMapping(value="/", method=RequestMethod.GET)
 public String getLoginForm() {
	 
		return "login";
 }
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm,Model model) {
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		if("admin".equals(username) && "admin".equals(password)) {
			return  "redirect:/home";//
		}
		model.addAttribute("invalidCredentials",true);
		return "login";
		
	}
	
 
 
 
 
 @GetMapping("/home")
	public String home(Model m) {
		return findPaginated(0, m);
	}

	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_emp";
	}

	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e, HttpSession session) {
		service.addEmp(e);
		session.setAttribute("msg", "Emplyoee Added Sucessfully..");
		return "redirect:/home";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee e = service.getEMpById(id);
		m.addAttribute("emp", e);
		return "edit";
	}

	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e, HttpSession session) {
		service.addEmp(e);
		session.setAttribute("msg", "Employee Data Updated Sucessfully..");
		return "redirect:/home";
	}

	@GetMapping("/delete/{id}")
	public String deleteEMp(@PathVariable int id, HttpSession session) {

		service.deleteEMp(id);
		session.setAttribute("msg", "Emp Data Delete Sucessfully..");
		return "redirect:/home";
	}

	@GetMapping("/page/{pageno}")
	public String findPaginated(@PathVariable int pageno, Model m) {

		Page<Employee> emplist = service.getEMpByPaginate(pageno, 5);
		m.addAttribute("emp", emplist);
		m.addAttribute("currentPage", pageno);
		m.addAttribute("totalPages", emplist.getTotalPages());
		m.addAttribute("totalItem", emplist.getTotalElements());
		return "emp";//
	}

}


