package com.example.Carproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Carproject.Model.Userlogin;

@Repository
public interface UserloginRepository extends JpaRepository<Userlogin,Integer>{
	Userlogin findByUsername(String username);
	
}
