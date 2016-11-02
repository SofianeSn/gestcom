package com.net.gestcom.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.net.gestcom.entity.StockBL;
import com.net.gestcom.service.ArticleService;
import com.net.gestcom.service.FournisseurService;
import com.net.gestcom.service.StockBLService;

@Controller
public class StockController {
	
	@Autowired
	private StockBLService stockBLService;
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private FournisseurService fournisseurService;
	
	@ModelAttribute("stockBL")
	public StockBL construct(){
		return new StockBL();
	}
	
	
	@RequestMapping("/stock")
	public String showstock(Model model){
		model.addAttribute("stockBLs", stockBLService.findAll());
		return "stock";
	}
	
	@RequestMapping("/stockBL/{id}")
	public String findStockBL(@PathVariable Long id ){
		stockBLService.findOne(id);
		return "redirect:/stock.html";
	}
	
	 @RequestMapping("/stockBL/remove/{id}")
		public String removestockBL(@PathVariable Long id ){
	stockBLService.delete(id);
	return "redirect:/stock.html";
}
	
	@RequestMapping("/stockBLform")
	public String showStockBLForm(Model model){
		model.addAttribute("fournisseurs", fournisseurService.findAll());
		model.addAttribute("articles", articleService.findAll());
		return "stockBLform";
	}
	
	@RequestMapping(value="/stockBLform",method=RequestMethod.POST)
	public String addStockBL(@ModelAttribute ("stockBL") StockBL stockBL,final RedirectAttributes redirectAttributes ){
		stockBLService.save(stockBL);
		redirectAttributes.addFlashAttribute("sockBL", stockBL);
	return "redirect:/stockBLform.html?success=true";
}
	
	@RequestMapping(value="/stockBL",method=RequestMethod.GET)
	public String showNewStockBL(@ModelAttribute("stockBL") StockBL stockBL ,Model model){
		model.addAttribute("stoc",stockBL );
		return "stockBL";
	}
	
}
