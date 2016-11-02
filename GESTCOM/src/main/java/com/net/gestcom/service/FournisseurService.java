package com.net.gestcom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Fournisseur;
import com.net.gestcom.repository.FournisseurRepository;

@Service
@Transactional
public class FournisseurService {

	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	public List<Fournisseur> findAll(){
		return fournisseurRepository.findAll();
		
		
	}

	public void save(Fournisseur fournisseur) {
		
	    fournisseurRepository.save(fournisseur);
		
	}

	public Fournisseur findOne(Long idFourn) {
		
		return fournisseurRepository.findOne(idFourn);
		
	}

	public void delete(Long idFourn) {
		
		fournisseurRepository.delete(idFourn);
		
	}
	
	public Fournisseur update (Fournisseur fournisseur){
		Fournisseur fournisseurupdate=fournisseurRepository.findOne(fournisseur.getIdFourn());
		
		fournisseurupdate.setNom(fournisseur.getNom());
		fournisseurupdate.setEmail(fournisseur.getEmail());
		fournisseurupdate.setAdresse(fournisseur.getAdresse());
		fournisseurupdate.setMF(fournisseur.getMF());
		fournisseurupdate.setRC(fournisseur.getRC());
		fournisseurupdate.setPays(fournisseur.getPays());
		fournisseurupdate.setTel(fournisseur.getTel());
		fournisseurupdate.setFax(fournisseur.getFax());
		return fournisseurupdate;
		
		
	}
	
}
