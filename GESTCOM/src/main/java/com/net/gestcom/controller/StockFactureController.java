package com.net.gestcom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.net.gestcom.entity.StockFacture;
import com.net.gestcom.service.StockFactureService;

@Controller
public class StockFactureController {
	
	@Autowired
	private StockFactureService stockFactureService;
	
	@RequestMapping("/stockfacture")
	public String ListFacture(Model model){
		model.addAttribute("stockfactures", stockFactureService.findAll());
		
		return "stockfacture";
		
	}
	
	@RequestMapping("/stockfacture/{id}")
	public String findStockfacture(@PathVariable Long id ){
		stockFactureService.findOne(id);
		return "stockfacture";
	}
	
	 @RequestMapping("/stockfacture/remove/{id}")
		public String removestockfacture(@PathVariable Long id ){
	stockFactureService.delete(id);
	return "redirect:/stockfacture.html";
}
	

}
