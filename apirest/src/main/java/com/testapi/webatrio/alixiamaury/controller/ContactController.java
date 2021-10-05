package com.testapi.webatrio.alixiamaury.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.testapi.webatrio.alixiamaury.model.ContactModel;
import com.testapi.webatrio.alixiamaury.service.ContactService;


@Controller
public class ContactController {
	@Autowired
	ContactService service ;
	
	@GetMapping("/")
    public String home() {
        return "home";
    }
	@GetMapping("/formulaire")
    public String formulaire() {
        return "formulaire";
    }
	@GetMapping("/contacts")
	public ModelAndView listeContact()
	{
		List<ContactModel> contacts = service.listeContact();
		return new ModelAndView("contacts.html", "contacts", contacts);
	}

}
