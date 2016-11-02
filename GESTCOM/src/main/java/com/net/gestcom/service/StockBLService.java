package com.net.gestcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Client;
import com.net.gestcom.entity.StockBL;
import com.net.gestcom.repository.StockBLRepository;

@Service
public class StockBLService {
	
	@Autowired
	private StockBLRepository stockBLRepository;

	public List<StockBL> findAll(){
		return stockBLRepository.findAll();
	}

	public void save(StockBL stockBL) {
		stockBLRepository.save(stockBL);
		
	}

	public void findOne(Long id) {
		stockBLRepository.findOne(id);
		
	}

	public void delete(Long id) {
      stockBLRepository.delete(id);		
	}
	
	

}
