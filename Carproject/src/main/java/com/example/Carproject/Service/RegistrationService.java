package com.example.Carproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Carproject.Model.Registration;
import com.example.Carproject.Repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository regRepo;


	public Registration saveDetails(Registration u) {
		// TODO Auto-generated method stub
		return regRepo.save(u);
	}

	}

