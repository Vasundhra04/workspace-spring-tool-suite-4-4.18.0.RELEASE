package com.example.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newproject.model.Add;



@Repository

public interface AddRepository extends JpaRepository<Add,Long>
{

}