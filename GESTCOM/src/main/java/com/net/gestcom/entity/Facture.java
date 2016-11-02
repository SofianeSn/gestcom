package com.net.gestcom.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Facture  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFact;
	@NotEmpty
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private String dateF;
	
	
	private int remise;
	
	private int tva;
	
	private int fodec;
	
	
	
	private int numFact;
	
	
	private int total_HTVA;
	
	private int quantite;
	
	
	private int total_TVA;
	
	
	private int TTTC;
	
	
	@ManyToOne
	@JoinColumn(name="idClent")
	private Client client;
	
	@ManyToMany(mappedBy="factures",cascade=CascadeType.REMOVE)
	private List<Article> articles;
	
	
	

	public int getTva() {
		return tva;
	}

	public void setTva(int tva) {
		this.tva = tva;
	}

	public int getFodec() {
		return fodec;
	}

	public void setFodec(int fodec) {
		this.fodec = fodec;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getNumFact() {
		return numFact;
	}

	public void setNumFact(int numFact) {
		this.numFact = numFact;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	

	

	

	

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Long getIdFact() {
		return idFact;
	}

	public void setIdFact(Long idFact) {
		this.idFact = idFact;
	}

	public String getDateF() {
		return dateF;
	}

	public void setDateF(String dateF) {
		this.dateF = dateF;
	}

	public int getRemise() {
		return remise;
	}

	public void setRemise(int remise) {
		this.remise = remise;
	}

	public int getTotal_HTVA() {
		return total_HTVA;
	}

	public void setTotal_HTVA(int total_HTVA) {
		this.total_HTVA = total_HTVA;
	}

	public int getTotal_TVA() {
		return total_TVA;
	}

	public void setTotal_TVA(int total_TVA) {
		this.total_TVA = total_TVA;
	}

	public int getTTTC() {
		return TTTC;
	}

	public void setTTTC(int tTTC) {
		TTTC = tTTC;
	}
	
	
	

}
