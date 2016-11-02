package com.net.gestcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Facture;
import com.net.gestcom.repository.FactureRepository;


@Service
public class FactureService {
	
	@Autowired
	private FactureRepository factureRepository;

	public List<Facture> findAll() {
		
		return factureRepository.findAll();
	}

	public Facture findOne(Long idFact) {
		
		return factureRepository.findOne(idFact);
	}

	public void delete(Long idFact) {
		factureRepository.delete(idFact);
		
	}

	public void save(Facture facture) {
		
		 factureRepository.save(facture);
	}
	
	
	

}
