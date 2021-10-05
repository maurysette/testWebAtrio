package com.testapi.webatrio.alixiamaury.model;

import java.util.Date;


public class ContactModel {

	private long id;
	private String nom;
	private String prenom;
	public Date dateNaissance;
	private int age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate() {
		return dateNaissance;
	}
	public void setDate(Date date) {
		this.dateNaissance = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
