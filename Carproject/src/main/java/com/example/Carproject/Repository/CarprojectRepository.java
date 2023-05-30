package com.example.Carproject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.Carproject.Model.Carproject;

@Repository
public interface CarprojectRepository extends JpaRepository<Carproject,Integer>{

	
	List<Carproject> findByFuelStartingWith(String  prefix);
	List<Carproject> findByFuelEndingWith(String  suffix);
	List<Carproject> findBySeating(String seating);
	
	
	@Query("select s from Carproject s where s.mileage=?1 and s.carmodel=?2" )
	public List<Carproject> fetchCarByMileage(String mileage,String carmodel);
	
	@Query("select s from Carproject s where s.price=:price")
	public List<Carproject> getCarByPrice(String price);
	
	
	@Modifying
	@Query("delete from Carproject s where s.id=?1")
	public int deleteCarById(int id);
	
	@Modifying
	@Query("update Carproject s set s.id=?1 where s.carmodel=?2")
	public int updateCarById(int id,String carmodel);
	
	@Query(value="select * from Carproject s where s.id=?",nativeQuery=true)
	public List<Carproject> fetchCarById(int id);
}
