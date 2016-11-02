package com.net.gestcom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.gestcom.entity.Article;
import com.net.gestcom.entity.Categorie;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	
	List<Article> findByCategorie(Categorie categorie);

}
