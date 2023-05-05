package com.example.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newproject.model.Per;



@Repository

public interface PerRepository extends JpaRepository<Per,Long>
{

	
 
}