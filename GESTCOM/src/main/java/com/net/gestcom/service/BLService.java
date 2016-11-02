package com.net.gestcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.BonLivraison;
import com.net.gestcom.repository.BonLivraisonRepository;

@Service
public class BLService {
	
	@Autowired
	private BonLivraisonRepository blRepository;

	public List<BonLivraison> findAll() {
  		return blRepository.findAll();
	}

	public BonLivraison findOne(Long id) {
		
		return blRepository.findOne(id);
	}
	
	

}
