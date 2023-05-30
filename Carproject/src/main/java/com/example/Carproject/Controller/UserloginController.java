package com.example.Carproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Carproject.Model.Userlogin;
import com.example.Carproject.Service.UserloginService;




@RestController
public class UserloginController {
	@Autowired
	UserloginService lser;
	
	//http://localhost:8080/checkLogin
	
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody Userlogin l)
	{
		System.out.println(l.getUsername());
		return lser.validateUser(l.getUsername(), l.getPassword());
	}
	
	//http://localhost:8080/addUser
	
	@PostMapping("/addUser")
	public Userlogin addDetails(@RequestBody Userlogin l)
	{
		return lser.saveUser(l);
	}

}
