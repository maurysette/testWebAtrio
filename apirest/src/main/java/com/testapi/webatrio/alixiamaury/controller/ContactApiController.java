package com.testapi.webatrio.alixiamaury.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.testapi.webatrio.alixiamaury.service.ContactService;

@RestController
public class ContactApiController {
	@Autowired
	ContactService service ;
	
	

}
