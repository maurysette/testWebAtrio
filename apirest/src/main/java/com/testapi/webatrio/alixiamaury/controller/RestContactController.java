package com.testapi.webatrio.alixiamaury.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testapi.webatrio.alixiamaury.entity.ContactEntity;
import com.testapi.webatrio.alixiamaury.service.ContactService;

@RestController
public class RestContactController {
	@Autowired
	ContactService service ;
	
	  
	@PostMapping("api/nouveauContact")
	public String  createContact(@RequestParam String nom,@RequestParam String prenom,@RequestParam Date dateNaissance,@RequestParam int age,HttpServletResponse response ) throws IOException {
		String result = service.create(nom, prenom, dateNaissance, age);
		response.sendRedirect("/formulaire");
		return result;
	}
	@GetMapping("api/contact")
	public List<ContactEntity> listPokemonView()
	{
		List<ContactEntity> contacts = service.listeContact();
		return contacts;
	}
}
