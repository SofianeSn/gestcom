package com.net.gestcom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.net.gestcom.service.BLService;


@Controller
public class BLController {
	
	@Autowired
	private BLService blservice;

	
	@RequestMapping("/bonlivraison")
	public String clientList(Model model){
		model.addAttribute("bonlivraisons", blservice.findAll());
		return "bonlivraison";
	
	}
	
	 @RequestMapping(value="/bonlivraison/view/{id}" ,method=RequestMethod.GET)
		public String viewfacture( @PathVariable Long id ,Model model){
	model.addAttribute("bonlivraison", blservice.findOne(id));
	return "viewbonlivraison";
}
	
	
}
