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
	
	public String create(String name, String prenom,Date date,int age){
		ContactEntity entity = new ContactEntity() ;
		entity.setNom(name);
		entity.setPrenom(prenom);
		entity.setDate(date);
		entity.setAge(age);
		em.persist(entity);
		em.getTransaction().commit();
	    return "Création réussie";
	}
	
	public String delete(long id){
		ContactEntity entity = em.find(ContactEntity.class, id);
		if (entity == null) {
			return "identifiant inconnu, veuillez réessayez";
		}
		em.remove(entity);
		return "Suppression réalisée";
	}
	
	public String updateNom(long id, String nom) {
		ContactEntity entity = em.find(ContactEntity.class, id);
		if(nom.isEmpty()){
			return "le champ nom est vide";
		}else if(entity == null) {
			return "identifiant inconnu";
		}
		entity.setNom(nom);
		return "modification du nom effectuée " ;
	}
	
	public String updatePrenom(long id,String prenom) {
		ContactEntity entity = em.find(ContactEntity.class, id);
		if(prenom.isEmpty()){
			return "le champ prenom est vide";
		}else if(entity == null) {
			return "identifiant inconnu";
		}
		entity.setPrenom(prenom);
		return "modification du prénom effectuée " ;
	}
	
	public String updateAge(long id, int age) {
		ContactEntity entity = em.find(ContactEntity.class, id);
		if(Integer.toString(age).isEmpty()){
			return "le champ age est vide";
		}else if(entity == null) {
			return "identifiant inconnu";
		}
		entity.setAge(age);
		return "modification de l'âge effectuée " ;
	}
	
	public String updateDate(long id, Date date) {
		ContactEntity entity = em.find(ContactEntity.class, id);
		if(date.toString().isEmpty()){
			return "le champ date est vide";
		}else if(entity == null) {
			return "identifiant inconnu";
		}
		entity.setDate(date);
		return "modification de l'âge effectuée " ;
	}
}
