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

import com.net.gestcom.entity.Article;
import com.net.gestcom.entity.Categorie;
import com.net.gestcom.entity.Client;
import com.net.gestcom.entity.Marque;
import com.net.gestcom.repository.MarqueRepository;
import com.net.gestcom.service.CategorieService;
import com.net.gestcom.service.MarqueService;
import com.net.gestcom.service.ArticleService;




@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService stockListService;
	
	@Autowired
	private CategorieService categorieService;
	
	
	
	@Autowired
	private MarqueService marqueService;
	
	
	@ModelAttribute
	public Categorie constructCat(){
		return new Categorie(); 
	} 
	
	@ModelAttribute
	public Marque constructMarque(){
		return new Marque(); 
	} 
	
	@ModelAttribute("article")
	public Article constructArt(){
		return new Article();
	}
	
	
	@RequestMapping("/articles")
	public String stockList (Model model){
		model.addAttribute("articles", stockListService.findAll());
		return "articles";
		
		
	}
	
	@RequestMapping("/categories")
	public String categList(Model model){
		model.addAttribute("categories", categorieService.findAll());
		
		return "categories";
	}
	
	@RequestMapping("/marque")
	public String marqueList(Model model){
		model.addAttribute("marques", marqueService.findAll());
		return "marque";
		
	}
	
	@RequestMapping(value="/categories" ,method=RequestMethod.POST )
	public String doAddCat (@ModelAttribute("categorie") Categorie categorie){
		  categorieService.save(categorie);
			return "redirect:/categories.html";
	}
	
	@RequestMapping(value="/marque" ,method=RequestMethod.POST )
	public String doAddMarque (@ModelAttribute("marque") Marque marque){
		  marqueService.save(marque);
			return "redirect:/marque.html";
}
	
	@RequestMapping("/articleForm")
	public String showArtForm(Model model){
		 model.addAttribute("categories", categorieService.findAll());
		model.addAttribute("marques", marqueService.findAll());
		return "articleForm";
	}
	
	
	
	
	@RequestMapping(value="/articleForm" ,method=RequestMethod.POST )
	public String doAddArticle (@ModelAttribute("article") Article article){
		  stockListService.save(article);
			return "redirect:/articleForm.html?success=true";
}
	
	@RequestMapping("/article/{idArt}")
	public String findArt(@PathVariable Long idArt){
		stockListService.findOne(idArt);
		return "redirect:/articles.html";
	}

	
	
	        @RequestMapping("/article/remove/{idArt}")
			public String removeArt(@PathVariable Long idArt ){
		stockListService.delete(idArt);
		return "redirect:/articles.html";
	}
	        
	        @RequestMapping("/categorie/{idCat}")
	    	public String findCat(@PathVariable Long idCat){
	    		categorieService.findOne(idCat);
	    		return "redirect:/categories.html";
	    	}

	    	
	    	
	    	        @RequestMapping("/categorie/remove/{idCat}")
	    			public String removeCat(@PathVariable Long idCat ){
	    		categorieService.delete(idCat);
	    		return "redirect:/categories.html";
	    	}
	    	        
	    	        @RequestMapping("/marque/{idMarque}")
	    	    	public String findMarque(@PathVariable Long idMarque){
	    	    		marqueService.findOne(idMarque);
	    	    		return "redirect:/marque.html";
	    	    	}

	    	    	
	    	    	
	    	    	        @RequestMapping("/marque/remove/{idMarque}")
	    	    			public String removeMarque(@PathVariable Long idMarque ){
	    	    		marqueService.delete(idMarque);
	    	    		return "redirect:/marque.html";
	    	    	}
	
	    	    	        @RequestMapping(value="/marque/update/{idMarque}" ,method=RequestMethod.GET)
	    	    			public String updatemarque( @PathVariable Long idMarque ,Model model){
	    	    		model.addAttribute("marque", marqueService.findOne(idMarque));
	    	    		return "updatemarque";
	    	    	     }

	    	    		 @RequestMapping(value="/marque/update/{idMarque}" ,method=RequestMethod.POST)
	    	    	 	public String doupdatemarque (@Valid @ModelAttribute("marque") Marque marque ,@PathVariable Long idMarque ,final RedirectAttributes redirectAttributes,BindingResult bindingResult){
	    	    	 	 if (bindingResult.hasErrors()){
	    	    	 		 return "updatemarque";
	    	    	 	 }
	    	    			 marqueService.update(marque);
	    	    	 	  
	    	    	 		return "redirect:/marque.html";  
	    	    	     }
	    	    	        
	
	    	    		 
	    	    		  @RequestMapping(value="/categorie/update/{idCat}" ,method=RequestMethod.GET)
	    	    			public String updatecategorie( @PathVariable Long idCat ,Model model){
	    	    		model.addAttribute("categorie", categorieService.findOne(idCat));
	    	    		return "updatecategorie";
	    	    	     }

	    	    		 @RequestMapping(value="/categorie/update/{idCat}" ,method=RequestMethod.POST)
	    	    	 	public String doupdatemarque (@Valid @ModelAttribute("categorie") Categorie categorie ,@PathVariable Long idCat ,final RedirectAttributes redirectAttributes,BindingResult bindingResult){
	    	    	 	 if (bindingResult.hasErrors()){
	    	    	 		 return "updatecategorie";
	    	    	 	 }
	    	    			 categorieService.update(categorie);
	    	    	 	  
	    	    	 		return "redirect:/categories.html";  
	    	    	     }
	
}
