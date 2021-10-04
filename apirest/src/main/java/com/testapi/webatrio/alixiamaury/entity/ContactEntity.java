package com.testapi.webatrio.alixiamaury.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//annotation Lombok gère les getters et setters
@Data
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

}
