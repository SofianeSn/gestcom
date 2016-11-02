package com.net.gestcom.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.net.gestcom.entity.Client;
import com.net.gestcom.entity.Fournisseur;
import com.net.gestcom.entity.User;
import com.net.gestcom.service.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@ModelAttribute("client")
	public Client construct(){
		return new Client();
	}

	
	@RequestMapping("/clients")
	public String clientList(Model model){
		model.addAttribute("clients", clientService.findAll());
		return "clients";
	}
	
	@RequestMapping("/clientform")
	public String addClient(){
		return "clientform";
	}
	
	@RequestMapping(value="/clientform" ,method=RequestMethod.POST)
	public String doAddClient (@Valid @ModelAttribute("client") Client client ,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return"clientform";
		}
	  clientService.save(client);
		return "redirect:/clientform.html?success=true";
	}
	
	@RequestMapping("/client/{idClent}")
	public String findClient(@PathVariable Long idClent ){
		clientService.findOne(idClent);
		return "redirect:/clients.html";
	}

	
	
	@RequestMapping("/client/remove/{idClent}")
	public String removeClient(@PathVariable Long idClent ){
		clientService.delete(idClent);
		return "redirect:/clients.html";
	}
	
	 @RequestMapping(value="/client/update/{idClent}" ,method=RequestMethod.GET)
		public String updateclient(@PathVariable Long idClent ,Model model){
	model.addAttribute("client", clientService.findOne(idClent));
	return "updateclient";
     }

	 @RequestMapping(value="/client/update/{idClent}" ,method=RequestMethod.POST)
 	public String doupdateclient (@Valid @ModelAttribute("client") Client client ,@PathVariable Long idClent ,final RedirectAttributes redirectAttributes , BindingResult bindingResult ){
 	  if(bindingResult.hasErrors()){
 		  return "updateclient";
 	  }
		 clientService.update(client);
 	  
 		return "redirect:/clients.html";  
     }

}
