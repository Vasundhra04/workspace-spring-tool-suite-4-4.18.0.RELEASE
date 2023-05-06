package com.example.Crudproject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Crudproject.Models.Crud;
import com.example.Crudproject.Repository.CrudRepository;



@Service
public class CrudService {

	@Autowired
	CrudRepository crudRepo;
	
	public List<Crud>getAllCrud()
	{
		List<Crud>crudList=crudRepo.findAll();
		return crudList;
	}
	public Crud saveStudents(Crud u)
	{
		return crudRepo.save(u);
	}
	public Crud updateStudents(Crud u,int regno)
	{
		Optional<Crud>optional=crudRepo.findById(regno);
		Crud obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setRegno(u.getRegno());
			obj.setName(u.getName());
			obj.setDept(u.getDept());
			
			crudRepo.saveAndFlush(u);
		}
		return obj;
	}
	
	public void deleteStudents(int regno)
	{
		crudRepo.deleteById(regno);
	}
}
