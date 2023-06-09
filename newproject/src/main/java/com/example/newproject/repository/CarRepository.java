package com.example.newproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.newproject.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {

	List<Car> findByModelStartingWith(String  prefix);
	List<Car> findByModelEndingWith(String  suffix);
	List<Car> findByEngine(String engine);
	
	
	@Query("select s from Car s where s.model=?1 and s.engine=?2" )
	public List<Car> fetchCarByModel(String model,String engine);
	
	@Query("select s from Car s where s.mileage=:mileage")
	public List<Car> getCarByMileage(String mileage);
	
	
	@Modifying
	@Query("delete from Car s where s.price=?1")
	public int deleteCarByPrice(String price);
	
	@Modifying
	@Query("update Insta s set s.model=?1 where s.engine=?2")
	public Car updateCarByModel(String model,String engine);
	
}
