package com.testapi.webatrio.alixiamaury.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testapi.webatrio.alixiamaury.entity.ContactEntity;
import com.testapi.webatrio.alixiamaury.model.ContactModel;
import com.testapi.webatrio.alixiamaury.repository.ContactRepository;


@Service
public class ContactService {
	
	@Autowired
	private ContactRepository repo;
	
	public List<ContactModel> listeContact() {
		List<ContactEntity> entities = this.repo.listeContact();

		List<ContactModel> result = new ArrayList<>();
		entities.forEach(entity -> result.add(convert(entity)));

		return result;
	}

	public String deleteContact(final Long id) {
		return this.repo.delete(id);
	}

	public String create(String name, String prenom,Date dateNaissance,int age) {
		return this.repo.create(name, prenom, dateNaissance, age) ;
	}
	
	public String updateDate(long id, Date dateNaissance) {
		return this.repo.updateDate(id, dateNaissance);
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

	private ContactModel convert(ContactEntity entity) {

		ContactModel view = new ContactModel();
		view.setNom(entity.getNom());
		view.setPrenom(entity.getNom());
		view.setDate(entity.getDate());
		view.setAge(entity.getAge());
		return view;
	}
}
