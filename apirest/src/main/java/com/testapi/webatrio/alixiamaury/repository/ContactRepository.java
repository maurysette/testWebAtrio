package com.testapi.webatrio.alixiamaury.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import com.testapi.webatrio.alixiamaury.entity.ContactEntity;


@Repository
public class ContactRepository  {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<ContactEntity> listeContact() {
		return em.createQuery("SELECT c FROM Contact c", ContactEntity.class).getResultList();
	}
	
	public ContactEntity create(String name, String prenom,Date date,int age){
		ContactEntity entity = new ContactEntity() ;
		entity.setNom(name);
		entity.setPrenom(prenom);
		entity.setDate(date);
		entity.setAge(age);
		em.persist(entity);
		em.getTransaction().commit();
	    return entity;
	}
	
	public String delete(long id){
		ContactEntity entity = em.find(ContactEntity.class, id);
		if (entity == null) {
			return "identifiant inconnu, veuillez réessayez";
		}
		em.remove(entity);
		return "Suppression réalisée";
	}

}
