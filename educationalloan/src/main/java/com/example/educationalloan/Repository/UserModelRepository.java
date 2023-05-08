package com.example.educationalloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educationalloan.Model.UserModel;

public interface UserModelRepository extends JpaRepository<UserModel,Integer>{

	UserModel findByEmail(String email);
}
