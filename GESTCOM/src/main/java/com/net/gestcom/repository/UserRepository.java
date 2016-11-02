package com.net.gestcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.gestcom.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);

	

}
