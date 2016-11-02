package com.net.gestcom.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Role;
import com.net.gestcom.entity.User;
import com.net.gestcom.repository.RoleRepository;
import com.net.gestcom.repository.UserRepository;


@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	public List<User> findAll(){
		
		return userRepository.findAll();
	}


	public void save(User user) {
		user.setEnabled(true);
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		
		List<Role> roles=new ArrayList<Role>();
		roles.add(roleRepository.findByName("ROLE_USER"));
		user.setRoles(roles);
		
		
		
		userRepository.save(user);
		
	}


	public void findOne(Long id) {
		
		userRepository.findOne(id);
	
		
	}


	public void delete(Long id) {
		
		userRepository.delete(id);
		
	}


	public User findOne(String name) {
		return userRepository.findByName(name);
		 
	}


	


	
	

}
