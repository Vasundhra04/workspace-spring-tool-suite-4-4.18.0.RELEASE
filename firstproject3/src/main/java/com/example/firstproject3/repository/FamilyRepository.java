package com.example.firstproject3.repository;

import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation.Family;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FamilyRepository<S> extends JpaRepository<Family,Integer> {

	

}
