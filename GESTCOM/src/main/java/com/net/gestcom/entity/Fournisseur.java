package com.net.gestcom.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;







@Entity
public class Fournisseur implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFourn;

	@NotEmpty
	private String nom;
	@NotEmpty
	private String adresse;
	@NotEmpty
	private String pays;
	@NotEmpty
	private String RC;
	@NotEmpty
	private String MF;
	@Email
	private String email;
	
	private int tel;
	private int fax;
	
	
	@OneToMany(mappedBy="fournisseur",cascade=CascadeType.REMOVE)
	private List<StockBL> stockBLs;
	
	@OneToMany(mappedBy="fournisseur",cascade=CascadeType.REMOVE)
	private List<StockFacture> stockFactures;
	
	@OneToMany(mappedBy="fournisseur",cascade=CascadeType.REMOVE)
	private List<StockNF> stockNFs;
	




	
	
	
	




	
	

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	

	public Long getIdFourn() {
		return idFourn;
	}




	public void setIdFourn(Long idFourn) {
		this.idFourn = idFourn;
	}




	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<StockBL> getStockBLs() {
		return stockBLs;
	}

	public void setStockBLs(List<StockBL> stockBLs) {
		this.stockBLs = stockBLs;
	}

	public List<StockFacture> getStockFactures() {
		return stockFactures;
	}

	public void setStockFactures(List<StockFacture> stockFactures) {
		this.stockFactures = stockFactures;
	}

	public List<StockNF> getStockNFs() {
		return stockNFs;
	}

	public void setStockNFs(List<StockNF> stockNFs) {
		this.stockNFs = stockNFs;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getRC() {
		return RC;
	}

	public void setRC(String rC) {
		RC = rC;
	}

	public String getMF() {
		return MF;
	}

	public void setMF(String mF) {
		MF = mF;
	}

	
}
