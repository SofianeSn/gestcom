package com.net.gestcom.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.net.gestcom.entity.User;
import com.net.gestcom.service.UserService;
import com.sun.tracing.dtrace.ModuleAttributes;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public User construct(){
		return new User();
	}
	
	
	
	
	@RequestMapping("/users")
	public String users(Model model){
		model.addAttribute("users", userService.findAll());
		return "users";
		
	}
	
	@RequestMapping("/userform")
	public String addUser(){
		return"userform";
	}
	
	@RequestMapping(value="/userform" ,method=RequestMethod.POST)
	public String doAdd(@Valid @ModelAttribute("user") User user,BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "userform";
		}
		userService.save(user);
		return "redirect:/userform.html?success=true";
		
	}
	
	@RequestMapping("/user/{id}")
	public String findUser(@PathVariable Long id ){
		userService.findOne(id);
		return "redirect:/users.html";
	}

	
	
	        @RequestMapping("/user/remove/{id}")
			public String removeuser(@PathVariable Long id ){
		userService.delete(id);
		return "redirect:/users.html";
	}
	
	
	@RequestMapping(value="/user/update/{id}",method=RequestMethod.GET)
	public String updateuser(@PathVariable Long id , Model model){
		userService.findOne(id);
		model.addAttribute("user");
		return"redirect:/users.html";
	}
	
	@RequestMapping(value="/user/update/{id}", method=RequestMethod.POST)
	public  String updateuserform( @ModelAttribute("user") User user, @PathVariable Long id,Model model){
		
		model.addAttribute(user);
		userService.save(user);
		
		
		
		return"redirect:/users.html";
	}

	@RequestMapping("/account")
	public String account (Model model ,Principal principal){
		
		String name=principal.getName();
		model.addAttribute("user", userService.findOne(name));
		return "user-details";
	}
	
	public static Object getPrincipal() 
	{
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    return auth == null ? null : auth.getPrincipal();
	}
	
	
}
