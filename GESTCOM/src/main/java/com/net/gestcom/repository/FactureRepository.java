package com.net.gestcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.gestcom.entity.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {

}
