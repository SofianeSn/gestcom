package com.net.gestcom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.net.gestcom.service.StockFactureService;
import com.net.gestcom.service.StockNFService;

@Controller
public class StockNFController {
	
	@Autowired
	private StockNFService stockNFService;
	
	@RequestMapping("/stockNF")
	public String ListStockNF(Model model){
		model.addAttribute("stockNF", stockNFService.findAll());
		
		return "stockNF";
		
	}
	
	@RequestMapping("/stockNF/{id}")
	public String findArt(@PathVariable Long id){
		stockNFService.findOne(id);
		return "stockNF";
	}

	
	
	        @RequestMapping("/stockNF/remove/{id}")
			public String removeArt(@PathVariable Long id ){
		stockNFService.delete(id);
		return "redirect:/stockNF.html";
	}

}
