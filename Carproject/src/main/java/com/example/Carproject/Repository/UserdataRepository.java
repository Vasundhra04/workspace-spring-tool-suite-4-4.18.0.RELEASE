package com.example.Carproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Carproject.Model.Userdata;

@Repository
public interface UserdataRepository extends JpaRepository<Userdata,Integer>{

}
