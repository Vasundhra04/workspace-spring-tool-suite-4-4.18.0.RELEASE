package com.example.newproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newproject.model.Per;
import com.example.newproject.repository.PerRepository;



@Service	
public class AddPerService {

	
	@Autowired
	PerRepository perRepo;
	
	public List<Per> fetchAllPersons()
	   {
		   return perRepo.findAll();
	   }
    public Per savePersons(Per p)
	   {
		   return perRepo.save(p);
	   }
}
