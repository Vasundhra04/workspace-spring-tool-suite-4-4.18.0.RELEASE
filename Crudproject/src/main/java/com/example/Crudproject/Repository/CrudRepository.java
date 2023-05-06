package com.example.Crudproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Crudproject.Models.Crud;

@Repository
public interface CrudRepository extends JpaRepository<Crud,Integer>{

}
