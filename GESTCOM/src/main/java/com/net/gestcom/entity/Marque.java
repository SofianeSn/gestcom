package com.net.gestcom.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Marque implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMarque;
	@NotEmpty
	
	private String name;
	@NotEmpty
	private String description;
	@OneToMany(mappedBy="marque")
	private Collection<Article> articles;
	
	public Long getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(Long idMarque) {
		this.idMarque = idMarque;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Collection<Article> getArticles() {
		return articles;
	}
	
	public void setArticles(Collection<Article> articles) {
		this.articles = articles;
	}
	
	
	


	

}
