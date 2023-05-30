package com.example.Carproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Carproject.Model.User;
import com.example.Carproject.Service.UserdataService;

@RestController
public class UserdataController {

	
	@Autowired
	UserdataService apService;
	
	
	//http://localhost:8080/getAllPersons
	@GetMapping("/getAllPersons")
     public List<User> fetchAllUser()
	   {
		  return apService.fetchAllUser();
	   }
	
	//http://localhost:8080/saveAlldata
	   @PostMapping("/saveAlldata")
	   public User savePersons(@RequestBody User p)
	   {
		   return apService.savePersons(p);
	   }
	  
}
