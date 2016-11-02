package com.net.gestcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.StockFacture;
import com.net.gestcom.repository.StockFactureRepository;

@Service
public class StockFactureService {
	
	@Autowired
	private StockFactureRepository stockFactureRepository;

	public List<StockFacture> findAll() {
		
		return stockFactureRepository.findAll();
	}

	public void findOne(Long id) {
       stockFactureRepository.findOne(id);		
	}

	public void delete(Long id) {
        stockFactureRepository.delete(id);		
	}
	
	

}
