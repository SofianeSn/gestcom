package com.net.gestcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.gestcom.entity.StockFacture;

public interface StockFactureRepository extends
		JpaRepository<StockFacture, Long> {

}
