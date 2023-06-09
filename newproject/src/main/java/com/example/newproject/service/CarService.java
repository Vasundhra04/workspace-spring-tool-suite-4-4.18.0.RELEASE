package com.example.newproject.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.newproject.model.Car;
import com.example.newproject.repository.CarRepository;

import jakarta.transaction.Transactional;

@Service
public class CarService {

	
	@Autowired
	CarRepository tutRepo;
	
	public List<Car>getAllTutors()
	{
		List<Car>tutList=(List<Car>) tutRepo.findAll();
		return tutList;
	}
	public Car saveTutors(Car u)
	{
		return tutRepo.save(u);
	}
	//public Car updateTutors(Car u,int phno)
	//{
		//Optional<Car> optional=tutRepo.findById(phno);
		//Car obj=null;
		//if(optional.isPresent())
	//	{
			//obj=optional.get();
			//obj.setPhno(u.getPhno());
			//obj.setEmailid(u.getEmailid());
			//obj.setPassword(u.getPassword());
			//obj.setUsername(u.getUsername());
			//tutRepo.saveAndFlush(u);
		//}
	//	return obj;
		
	//}
	public void deleteTutors(String model)
	{
		tutRepo.deleteAll();
}
	public Car getTutors(String model)
	{
		return tutRepo.findAll().get(0);
	}
	public  List<Car>sortTutors(String field)
	{
		return tutRepo.findAll(Sort.by(Direction.DESC,field));
	}
	
	public List<Car>pagingTutors(int offset,int  pageSize)
	{
		Page<Car>   obj= tutRepo.findAll(PageRequest.of(offset, pageSize));
		return obj.getContent();
	}
	public List<Car> paginate(int offset, int pageSize, String model) 
	{
		Page<Car> obj=tutRepo.findAll(PageRequest.of(offset, pageSize,Sort.by(model).descending()));
		return obj.getContent();
	}
	public  List<Car> fetchDetailsByModelPrefix(String prefix)
	{
		return tutRepo.findByModelStartingWith(prefix);
	}
	public  List<Car> fetchDetailsByModelSuffix(String suffix)
	{
		return tutRepo.findByModelEndingWith(suffix);
	}
	public  List<Car> findByEngine(String engine)
	{
		return tutRepo.findByEngine(engine);
	}
	
	public List<Car> fetchCarByModel(String model,String engine)
	  {
		  return tutRepo.fetchCarByModel(model, engine);
	  }
	public List<Car> getCarByMileage(String mileage) {
		return tutRepo.getCarByMileage(mileage);
	}
	
	@Transactional
	public int deleteCarByPrice(String price)
	{
		return tutRepo.deleteCarByPrice(price);
	}
	@Transactional
	public Car updateCarByModel(String model,String engine)
	{
		return tutRepo.updateCarByModel(model, engine);
	}
	
}
