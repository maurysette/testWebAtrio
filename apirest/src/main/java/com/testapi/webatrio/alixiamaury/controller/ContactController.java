package com.testapi.webatrio.alixiamaury.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
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
	
	

}
