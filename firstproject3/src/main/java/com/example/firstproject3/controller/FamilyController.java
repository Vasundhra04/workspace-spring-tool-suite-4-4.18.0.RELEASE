package com.example.firstproject3.controller;

import java.util.List;

import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject3.service.FamilyService;
@RestController
public class FamilyController {
	
	@Autowired
	FamilyService  famService;
	
	@GetMapping(value="/fetchFamily")
	public List<Family>getAllFamily()
	{
		List<Family>famList=famService.getAllFamily();
		return famList;
	}
	@PostMapping(value="/saveFamily")
	public Family saveFamily(@RequestBody Family u)
	{
		return famService.saveFamily(u);
	}
	@PutMapping(value="/updateFamily")
	public  Family updateFamily(@RequestBody Family u,@PathVariable ("id") int id)
	{
		return famService.saveFamily(u);
	}
	@DeleteMapping(value="/deleteFamily")
	public void deleteFamily(@PathVariable ("id") int id)
	{
		famService.deleteFamily(id);
	}
	@GetMapping(value="/getFamily")
	public Family getFamily(@PathVariable("id")int id)
	
	{
		return famService.getFamily(id);
	}
	@GetMapping("/sortStudents/{field}")
	public List<Family>sortFamily (@PathVariable String field)
	{
		return famService.sortFamily(field);
	}
	
	

}
