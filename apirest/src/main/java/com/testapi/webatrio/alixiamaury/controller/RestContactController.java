package com.testapi.webatrio.alixiamaury.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.testapi.webatrio.alixiamaury.service.ContactService;

@RestController
public class RestContactController {
	@Autowired
	ContactService service ;
	
	@PostMapping("formulaire")
	public ModelAndView createContact(@RequestParam String nom,@RequestParam String prenom,@RequestParam Date dateNaissance,@RequestParam int age ) {
		String result = service.create(nom, prenom, dateNaissance, age);
		ModelAndView modelAndView = new ModelAndView("formulaire.html");
		modelAndView.addObject("nom", nom);
		modelAndView.addObject("prenom", prenom);
		modelAndView.addObject("dateNaissance", dateNaissance);
		modelAndView.addObject("age", age);
		modelAndView.addObject("message", result);
		return modelAndView;
	}
}
