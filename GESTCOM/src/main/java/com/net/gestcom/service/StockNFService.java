package com.net.gestcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.StockNF;
import com.net.gestcom.repository.StockNFRepository;

@Service
public class StockNFService {
	
	@Autowired
	private StockNFRepository stockNFRepository;

	public List<StockNF> findAll() {
		
		return stockNFRepository.findAll();
	}

	public StockNF findOne(Long id) {
		return stockNFRepository.findOne(id);
		
	}

	public void delete(Long id) {
      stockNFRepository.delete(id);		
	}
	
	
	

}
