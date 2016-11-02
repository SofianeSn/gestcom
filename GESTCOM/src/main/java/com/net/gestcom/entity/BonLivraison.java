package com.net.gestcom.entity;

import java.io.Serializable;
import java.lang.Long;
import java.util.List;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class BonLivraison implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String dateBL;
	
	
	private int quantite;
	
	private int numBL;
	
	private int tht;
	
	@ManyToMany(mappedBy="BL")
	private List<Article> articles;
	
	@ManyToOne
	@JoinColumn(name="idClent")
	private Client client;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateBL() {
		return dateBL;
	}

	public void setDateBL(String dateBL) {
		this.dateBL = dateBL;
	}

	public int getNumBL() {
		return numBL;
	}

	public void setNumBL(int numBL) {
		this.numBL = numBL;
	}

	public int getTht() {
		return tht;
	}

	public void setTht(int tht) {
		this.tht = tht;
	}

	

	

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	


	   
	
	

	   
	

	   
	
	
   
}
