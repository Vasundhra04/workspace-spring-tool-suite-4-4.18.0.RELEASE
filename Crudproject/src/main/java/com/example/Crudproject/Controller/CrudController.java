package com.example.Crudproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crudproject.Models.Crud;
import com.example.Crudproject.Service.CrudService;




@RestController
public class CrudController {

	@Autowired
	CrudService studService;
	
	@GetMapping(value="/fetchStudents")
	public List<Crud>getAllStudents()
	{
		List<Crud>studList=studService.getAllCrud();
				return studList;
	}
	@PostMapping(value="/saveStudents")
	public Crud  saveStudents(@RequestBody Crud u)
	{
		return studService.saveStudents(u);
	}
	@PutMapping(value="/updateStudents/{regno}")
	public Crud updateStudents(@RequestBody Crud u,@PathVariable ("regno") int regno)
	{
		return studService.saveStudents(u);
	}
	@DeleteMapping(value="deleteStudents/{regno}")
	public void deleteStudents(@PathVariable("regno") int regno)
	{
		studService.deleteStudents(regno);
	}
	
}
