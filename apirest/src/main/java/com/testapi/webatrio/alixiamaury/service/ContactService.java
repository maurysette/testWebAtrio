package com.testapi.webatrio.alixiamaury.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapi.webatrio.alixiamaury.entity.ContactEntity;
import com.testapi.webatrio.alixiamaury.repository.ContactRepository;


@Service
public class ContactService {
	
	@Autowired
	private ContactRepository repo;
	
	public List<ContactEntity> listeContact() {
		return this.repo.listeContact();
	}


	public String deleteContact(final Long id) {
		return this.repo.delete(id);
	}

	public String create(String name, String prenom,Date date,int age) {
		return this.repo.create(name, prenom, date, age) ;
	}
	public String updateDate(long id, Date date) {
		return this.repo.updateDate(id, date);
	}
	public String updateAge(long id, int age) {
		return this.repo.updateAge(id, age);
	}
	public String updatePrenom(long id,String prenom) {
		return this.repo.updatePrenom(id, prenom);
	}
	public String updateNom(long id, String nom) {
		return this.repo.updateNom(id, nom);
	}

}
