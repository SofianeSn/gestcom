package com.net.gestcom.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.test.annotation.Timed;

@Entity
public class StockBL implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private String dateA;
	
	private int nbreboite;
	
   
	private int numfact;
	

	private int puht;
	

	private int remiseboite;
	

	private int tvaboite;
	

	private int puttc;
	

	private int total_ht;
	

	private int fodec;
	

	private int remise;
	

	private int tva;
	

	private int timbre;
	

	private int total_ttc;
	
	@ManyToOne
	@JoinColumn(name="idArt")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idFourn")
	private Fournisseur fournisseur;
	
	

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateA() {
		return dateA;
	}

	public void setDateA(String dateA) {
		this.dateA = dateA;
	}

	public int getNbreboite() {
		return nbreboite;
	}

	public void setNbreboite(int nbreboite) {
		this.nbreboite = nbreboite;
	}

	public int getNumfact() {
		return numfact;
	}

	public void setNumfact(int numfact) {
		this.numfact = numfact;
	}

	public int getPuht() {
		return puht;
	}

	public void setPuht(int puht) {
		this.puht = puht;
	}

	public int getRemiseboite() {
		return remiseboite;
	}

	public void setRemiseboite(int remiseboite) {
		this.remiseboite = remiseboite;
	}

	public int getTvaboite() {
		return tvaboite;
	}

	public void setTvaboite(int tvaboite) {
		this.tvaboite = tvaboite;
	}

	public int getPuttc() {
		return puttc;
	}

	public void setPuttc(int puttc) {
		this.puttc = puttc;
	}

	public int getTotal_ht() {
		return total_ht;
	}

	public void setTotal_ht(int total_ht) {
		this.total_ht = total_ht;
	}

	public int getFodec() {
		return fodec;
	}

	public void setFodec(int fodec) {
		this.fodec = fodec;
	}

	public int getRemise() {
		return remise;
	}

	public void setRemise(int remise) {
		this.remise = remise;
	}

	public int getTva() {
		return tva;
	}

	public void setTva(int tva) {
		this.tva = tva;
	}

	public int getTimbre() {
		return timbre;
	}

	public void setTimbre(int timbre) {
		this.timbre = timbre;
	}

	public int getTotal_ttc() {
		return total_ttc;
	}

	public void setTotal_ttc(int total_ttc) {
		this.total_ttc = total_ttc;
	}


}
