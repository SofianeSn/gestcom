package com.net.gestcom.controller;

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
import com.net.gestcom.entity.Facture;
import com.net.gestcom.entity.StockBL;
import com.net.gestcom.service.ArticleService;
import com.net.gestcom.service.ClientService;
import com.net.gestcom.service.FactureService;


@Controller
public class FactureController {
	
	@Autowired
	private FactureService factureService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ArticleService articleService;
	
	@ModelAttribute
	public Facture construct(){
		return new Facture();
	}

	
	
	@RequestMapping("/facture")
	public String clientList(Model model){
		model.addAttribute("factures", factureService.findAll());
		
		return "facture";
	
	}
	
	
	 @RequestMapping(value="/facture/view/{idFact}" ,method=RequestMethod.GET)
		public String viewfacture( @PathVariable Long idFact ,Model model){
	model.addAttribute("facture", factureService.findOne(idFact));
	return "viewfacture";
  }
	
	 @RequestMapping("/facture/remove/{idFact}")
		public String removestockBL(@PathVariable Long idFact ){
		 factureService.delete(idFact);
	return "redirect:/facture.html";
}
	 
	 @RequestMapping("/factureform")
		public String addfacture( Model model){
		 model.addAttribute("articles", articleService.findAll());
		 model.addAttribute("clients", clientService.findAll());
				return "factureform";
	}
		
		@RequestMapping(value="/factureform",method=RequestMethod.POST)
		public String doAddfacture(@ModelAttribute("facture") Facture facture ,Model model,BindingResult bindingResult){
			if(bindingResult.hasErrors()){
				return"factureform";
			}
			model.addAttribute(facture);
			return "factureform.html?success=true";
		}
		
	 
	
}
