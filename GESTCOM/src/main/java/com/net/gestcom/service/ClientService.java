package com.net.gestcom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Client;
import com.net.gestcom.entity.Client;
import com.net.gestcom.repository.ClientRepository;

@Service
@Transactional
public class ClientService {
	
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}

	public  void save(Client client) {
		clientRepository.save(client);
		
	}

	

	public Client findOne(Long idClent) {
		
		return clientRepository.findOne(idClent);
		
	}
	
	public void delete(Long idClent) {
		clientRepository.delete(idClent);
		
	}

	public Client update (Client client){
		Client clientupdate=clientRepository.findOne(client.getIdClent());
		
		clientupdate.setNomCl(client.getNomCl());
		clientupdate.setEmail(client.getEmail());
		clientupdate.setAdresseCl(client.getAdresseCl());
		clientupdate.setMf(client.getMf());
		clientupdate.setRc(client.getRc());
		clientupdate.setPays(client.getPays());
		clientupdate.setTel(client.getTel());
		clientupdate.setFax(client.getFax());
		return clientupdate;
	}
	
	
}
