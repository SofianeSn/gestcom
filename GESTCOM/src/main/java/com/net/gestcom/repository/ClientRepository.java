package com.net.gestcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.gestcom.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
