package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Personnew;
import com.example.demo.service.AddressPersonService;

@RestController
public class AddressPersonController {
	
	@Autowired
	AddressPersonService apService;
	
	
	//http://localhost:8080/getAllPersons
	@GetMapping("/getAllPersons")
     public List<Personnew> fetchAllPersons()
	   {
		  return apService.fetchAllPersons();
	   }
	
	//http://localhost:8080/saveAlldata
	   @PostMapping("/saveAlldata")
	   public Personnew savePersons(@RequestBody Personnew p)
	   {
		   return apService.savePersons(p);
	   }
	  
}


