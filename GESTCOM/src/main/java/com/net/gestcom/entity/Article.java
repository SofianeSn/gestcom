package com.net.gestcom.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;






/**
 * Entity implementation class for Entity: Article
 * 
 */
@Entity
public class Article implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArt;
	@NotEmpty
	
	private String ref_Art;
	@NotEmpty
	
	private String designation;
	
	private String codeABr;
	
	@Digits(fraction = 5, integer = 10)
	private int prix_HTVA;
	
	@Digits(fraction = 5, integer = 10)
	private int TVA;
	
	@ManyToOne
	@JoinColumn(name="idCat")
	private Categorie categorie;
	@ManyToOne
	@JoinColumn(name="idMarque")
	private Marque marque;
	
	@Digits(fraction = 5, integer = 10)
	private int quantite;
	
	@Digits(fraction = 5, integer = 10)
	private int quantite_min;
	
	@OneToMany(mappedBy="article" ,cascade=CascadeType.REMOVE)
	private List<StockBL> stockBL;
	
	@OneToMany(mappedBy="article",cascade=CascadeType.REMOVE)
	private List<StockFacture> stockFacture;
	
	@OneToMany(mappedBy="article",cascade=CascadeType.REMOVE)
	private List<StockNF> stockNF;
	
	@ManyToMany
	@JoinTable
	private List<Facture> factures;
	
	@ManyToMany
	@JoinTable
	private List<Devis> devis;
	
    @ManyToMany
    @JoinTable
	private List<BonLivraison> BL;

	
    
    

	public List<StockBL> getStockBL() {
		return stockBL;
	}

	public void setStockBL(List<StockBL> stockBL) {
		this.stockBL = stockBL;
	}

	public List<StockFacture> getStockFacture() {
		return stockFacture;
	}

	public void setStockFacture(List<StockFacture> stockFacture) {
		this.stockFacture = stockFacture;
	}

	public List<StockNF> getStockNF() {
		return stockNF;
	}

	public void setStockNF(List<StockNF> stockNF) {
		this.stockNF = stockNF;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public List<Devis> getDevis() {
		return devis;
	}

	public void setDevis(List<Devis> devis) {
		this.devis = devis;
	}

	public List<BonLivraison> getBL() {
		return BL;
	}

	public void setBL(List<BonLivraison> bL) {
		BL = bL;
	}

	public Long getIdArt() {
		return idArt;
	}

	public void setIdArt(Long idArt) {
		this.idArt = idArt;
	}

	public String getRef_Art() {
		return ref_Art;
	}

	public void setRef_Art(String ref_Art) {
		this.ref_Art = ref_Art;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCodeABr() {
		return codeABr;
	}

	public void setCodeABr(String codeABr) {
		this.codeABr = codeABr;
	}

	

	public int getPrix_HTVA() {
		return prix_HTVA;
	}

	public void setPrix_HTVA(int prix_HTVA) {
		this.prix_HTVA = prix_HTVA;
	}

	public int getTVA() {
		return TVA;
	}

	public void setTVA(int tVA) {
		TVA = tVA;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getQuantite_min() {
		return quantite_min;
	}

	public void setQuantite_min(int quantite_min) {
		this.quantite_min = quantite_min;
	}

	
	
	
	

	


}
