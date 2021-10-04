package com.testapi.webatrio.alixiamaury.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapi.webatrio.alixiamaury.entity.ContactEntity;
import com.testapi.webatrio.alixiamaury.model.ContactModel;
import com.testapi.webatrio.alixiamaury.repository.ContactRepository;




@Service
public class ContactService {
	@Autowired
	private ContactRepository repo;
	
	public List<ContactEntity> listeContact() {
		return repo.listeContact();
	}


	public void deleteContact(final Long id) {
		repo.delete(id);
	}

	public ContactModel create(String name, String prenom,Date date,int age) {
		ContactModel savedEmployee = repo.create(name, prenom,date,age);
		return savedEmployee;
	}

}
