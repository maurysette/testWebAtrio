package com.testapi.webatrio.alixiamaury.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity (name = "contact")
@Table (name = "contact")
public class ContactEntity {
	@Id
	@GeneratedValue
	private long id;
	@Column(name="contact_nom")
	private String nom;
	@Column(name="contact_prenom")
	private String prenom;
	@Column(name="contact_date")
	private Date date;
	@Column(name="contact_age")
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
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
