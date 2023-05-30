package com.example.Carproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Carproject.Model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer>{

}
