package com.net.gestcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Article;
import com.net.gestcom.entity.Categorie;
import com.net.gestcom.entity.Marque;
import com.net.gestcom.repository.ArticleRepository;
import com.net.gestcom.repository.CategorieRepository;


@Service
public class CategorieService {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
		
	}

	

	public void save(Categorie categorie) {
		categorieRepository.save(categorie);
		
	}

	public Categorie  findOne(Long idCat) {
		return categorieRepository.findOne(idCat);
		
	}



	public void delete(Long idCat) {
		categorieRepository.delete(idCat);
	}



	public Categorie update (Categorie categorie){
		Categorie categorieupdate=categorieRepository.findOne(categorie.getIdCat());
		
		categorieupdate.setNomCat(categorie.getNomCat());
		categorieupdate.setDescr(categorie.getDescr());
		
		return categorieupdate;
	}

}
