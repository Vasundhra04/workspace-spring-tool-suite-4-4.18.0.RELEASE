package com.example.newproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.newproject.model.Per;
import com.example.newproject.service.AddPerService;



@RestController
public class AddPerController {

	
	@Autowired
	AddPerService apService;
	
	
	//http://localhost:8080/getAllPersons
	@GetMapping("/getAllPersons")
     public List<Per> fetchAllPersons()
	   {
		  return apService.fetchAllPersons();
	   }
	
	//http://localhost:8080/saveAlldata
	   @PostMapping("/saveAlldata")
	   public Per savePersons(@RequestBody Per p)
	   {
		   return apService.savePersons(p);
	   }
}
