package com.net.gestcom.service;

import java.util.List;








import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.net.gestcom.entity.Article;
import com.net.gestcom.entity.Client;
import com.net.gestcom.entity.Marque;
import com.net.gestcom.repository.ArticleRepository;



@Service
@Transactional
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	
	
	public List<Article> findAll(){
		return articleRepository.findAll();
	}



	public void save(Article article) {
		
		articleRepository.save(article);
		
	}



	public void findOne(Long idArt) {
		articleRepository.findOne(idArt);
		
	}



	public void delete(Long idArt) {
		
		articleRepository.delete(idArt);


		
	}
	
	
	
	
	
}
