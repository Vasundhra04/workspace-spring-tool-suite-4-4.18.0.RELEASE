package com.example.firstproject3.service;

import java.util.List;


import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.firstproject3.repository.FamilyRepository;
@Service
public class FamilyService {

	@Autowired
	FamilyRepository famRepo;
	
	public List<Family>getAllFamily()
	{
		List<Family>famList=famRepo.findAll();
		return famList;
	}
	public Family saveFamily(Family u)
	{
		return  famRepo.save(u);
	}
	
	public void deleteFamily(int id)
	{
		famRepo.deleteById(id);
	}
	public Family getFamily(int id)
	{
		return  famRepo.findById(id).get();
	}
	public List<Family>sortFamily(String field)
	{
		return  famRepo.findAll(Sort.by(Direction.DESC,field));
	}
	
}
