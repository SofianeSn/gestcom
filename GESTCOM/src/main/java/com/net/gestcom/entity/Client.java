package com.net.gestcom.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;





@Entity
public class Client implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClent;
    @NotEmpty
    
	private String nomCl;
    @NotEmpty
	private String adresseCl;
    @NotEmpty
	private String pays;
	@NotEmpty
	private String rc;
	@NotEmpty
	private String mf;
	
	@Email
    private String email;
	private int tel;
	private int fax;
	
	@OneToMany(mappedBy="client",cascade=CascadeType.REMOVE)
	private List<Facture> factures;
	
	@OneToMany(mappedBy="client",cascade=CascadeType.REMOVE)
	private List<Devis> devis;

	@OneToMany(mappedBy="client",cascade=CascadeType.REMOVE)
	private List<BonLivraison> BL;
	
	

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
	public Long getIdClent() {
		return idClent;
	}
	public void setIdClent(Long idClent) {
		this.idClent = idClent;
	}
	public String getNomCl() {
		return nomCl;
	}
	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}
	public String getAdresseCl() {
		return adresseCl;
	}
	public void setAdresseCl(String adresseCl) {
		this.adresseCl = adresseCl;
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
	
	
	public String getRc() {
		return rc;
	}
	public void setRc(String rc) {
		this.rc = rc;
	}
	public String getMf() {
		return mf;
	}
	public void setMf(String mf) {
		this.mf = mf;
	}
	
	
	
	
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
    public Client(Long idClen, String nomCl, String adresseCl, String pays, String rc,
			String mf, String email, int tel, int fax) {
		super();
		this.idClent = idClen;
		this.nomCl = nomCl;
		this.adresseCl = adresseCl;
		this.pays = pays;
		this.rc = rc;
		this.mf = mf;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
	}
}
