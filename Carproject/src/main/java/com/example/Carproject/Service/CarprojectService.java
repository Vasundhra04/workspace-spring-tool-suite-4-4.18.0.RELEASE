package com.example.Carproject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.Carproject.Model.Carproject;
import com.example.Carproject.Repository.CarprojectRepository;

import jakarta.transaction.Transactional;

@Service
public class CarprojectService {

	@Autowired
	CarprojectRepository tutRepo;
	
	public List<Carproject>getAllCar()
	{
		List<Carproject>tutList=(List<Carproject>) tutRepo.findAll();
		return tutList;
	}
	public Carproject saveCar(Carproject u)
	{
		return tutRepo.save(u);
	}
	public Carproject updateCar(Carproject u,int id)
	{
		Optional<Carproject> optional=tutRepo.findById(id);
		Carproject obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setId(u.getId());
			obj.setEngine(u.getEngine());
			obj.setCarmodel(u.getCarmodel());
			obj.setBootspace(u.getBootspace());
			obj.setFuel(u.getFuel());
			obj.setMaxpower(u.getMaxpower());
			obj.setMileage(u.getMileage());
			obj.setPrice(u.getPrice());
			obj.setSeating(u.getSeating());
		
			tutRepo.saveAndFlush(u);
		}
		return obj;
		
	}
	public void deleteCar(int id)
	{
		tutRepo.deleteById(id);
}
	public Carproject getCar(int id)
	{
		return tutRepo.findById(id).get();
	}
	public  List<Carproject>sortCar(String field)
	{
		return tutRepo.findAll(Sort.by(Direction.DESC,field));
	}
	
	public List<Carproject>pagingCar(int offset,int  pageSize)
	{
		Page<Carproject>   obj= tutRepo.findAll(PageRequest.of(offset, pageSize));
		return obj.getContent();
	}
	public List<Carproject> paginate(int offset, int pageSize, String carmodel) 
	{
		Page<Carproject> obj=tutRepo.findAll(PageRequest.of(offset, pageSize,Sort.by(carmodel).descending()));
		return obj.getContent();
	}
	public  List<Carproject> fetchCarByFuelPrefix(String prefix)
	{
		return tutRepo.findByFuelStartingWith(prefix);
	}
	public  List<Carproject> fetchCarByFuelSuffix(String suffix)
	{
		return tutRepo.findByFuelEndingWith(suffix);
	}
	public  List<Carproject> findBySeating(String seating)
	{
		return tutRepo.findBySeating(seating);
	}
	
	public List<Carproject> fetchCarByMileage(String mileage,String carmodel)
	  {
		  return tutRepo.fetchCarByMileage(mileage, carmodel);
	  }
	public List<Carproject> getCarByPrice(String price) {
		return tutRepo.getCarByPrice(price);
	}
	
	@Transactional
	public int deleteCarById(int id)
	{
		return tutRepo.deleteCarById(id);
	}
	@Transactional
	public int updateCarById(int id,String carmodel)
	{
		return tutRepo.updateCarById(id, carmodel);
	}
	
	

}
