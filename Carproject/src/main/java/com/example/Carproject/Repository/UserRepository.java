package com.example.Carproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Carproject.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
