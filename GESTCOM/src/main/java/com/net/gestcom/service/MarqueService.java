package com.net.gestcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Client;
import com.net.gestcom.entity.Marque;
import com.net.gestcom.repository.MarqueRepository;


@Service
public class MarqueService {
	
	@Autowired
	private MarqueRepository marqueRepository;
	
	public List<Marque> findAll() {
		return marqueRepository.findAll();
		
	}

	public void save(Marque marque) {
		
		marqueRepository.save(marque);
		
	}

	public Marque findOne(Long idMarque) {
		return marqueRepository.findOne(idMarque);
		
	}

	public void delete(Long idMarque) {
		
		marqueRepository.delete(idMarque);


		
	}
	
	public Marque update (Marque marque){
		Marque marqueupdate=marqueRepository.findOne(marque.getIdMarque());
		
		marqueupdate.setName(marque.getName());
		marqueupdate.setDescription(marque.getDescription());
		
		return marqueupdate;
	}

}
