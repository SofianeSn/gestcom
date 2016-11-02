package com.net.gestcom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.net.gestcom.entity.Article;
import com.net.gestcom.service.ArticleService;

@Controller
public class PDFController {
	
	@Autowired
	private  ArticleService stockListService;
	
	 /**
     * Handle request to the default page
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewHome() {
        return "home";
    }
    
    /**
     * Handle request to download a PDF document
     */
    @RequestMapping(value = "/downloadPDF", method = RequestMethod.GET)
    public ModelAndView downloadExcel(ModelAndView model) {
        // create some sample data
        List<Article> listArticles = new ArrayList<Article>();
        listArticles.add(new Article());
        listArticles.add(new Article());
        listArticles.add(new Article());
        listArticles.add(new Article());
 
        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("pdfView", "listArticles", listArticles);
 
    }

}
