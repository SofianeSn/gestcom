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
import com.net.gestcom.service.FournisseurService;


@Controller
public class FournisseurController {

	@Autowired
	private FournisseurService fournisseurService;
	
	@ModelAttribute("fournisseur")
	public Fournisseur construct(){
		return new Fournisseur();
	}
	
	@RequestMapping("/fournisseurs")
	public String fournisseurList(Model model){
		model.addAttribute("fournisseurs", fournisseurService.findAll());
		return "fournisseurs";
		
	}
	
	
	@RequestMapping("/fournisseurform")
	public String addFournisseur(){
		return "fournisseurform";
	}

	@RequestMapping(value="/fournisseurform" ,method=RequestMethod.POST)
	public String doAddfournisseur (@Valid @ModelAttribute("fournisseur") Fournisseur fournisseur ,BindingResult bindingResult){
		if (bindingResult.hasErrors()){
			return "fournisseurform";
		}
	  fournisseurService.save(fournisseur);
		return "redirect:/fournisseurform.html?success=true";
	}
	
	@RequestMapping("/fournisseur/{idFourn}")
	public String findFour(@PathVariable Long idFourn ){
		fournisseurService.findOne(idFourn);
		return "redirect:/fournisseurs.html";
	}

	
	
	        @RequestMapping("/fournisseur/remove/{idFourn}")
			public String removeFourn(@PathVariable Long idFourn ){
		fournisseurService.delete(idFourn);
		return "redirect:/fournisseurs.html";
	}
	        

	        @RequestMapping(value="/fournisseur/update/{idFourn}" ,method=RequestMethod.GET)
			public String updateFourn(@PathVariable Long idFourn ,Model model){
		model.addAttribute("fournisseur", fournisseurService.findOne(idFourn));
		return "updatefournisseur";
	        }
	        
	        @RequestMapping(value="/fournisseur/update/{idFourn}" ,method=RequestMethod.POST)
	    	public String doupdatefournisseur (@Valid @ModelAttribute("fournisseur") Fournisseur fournisseur ,@PathVariable Long idFourn ,final RedirectAttributes redirectAttributes, BindingResult bindingResult){
	        	if (bindingResult.hasErrors()){
	        		return "updatefournisseur";
	        	}
	    	  fournisseurService.update(fournisseur);
	    	  
	    		return "redirect:/fournisseurs.html";  
	        }
	
}
