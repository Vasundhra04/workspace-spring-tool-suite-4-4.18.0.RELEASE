package com.example.Carproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Carproject.Model.User;
import com.example.Carproject.Repository.UserRepository;


@Service
public class UserdataService {

	@Autowired
	UserRepository perRepo;
	
	public List<User> fetchAllUser()
	   {
		   return perRepo.findAll();
	   }
    public User savePersons(User p)
	   {
		   return perRepo.save(p);
	   
	   }
}
