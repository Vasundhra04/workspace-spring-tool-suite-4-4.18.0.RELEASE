package com.example.Carproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Carproject.Model.Carproject;
import com.example.Carproject.Service.CarprojectService;

import io.swagger.v3.oas.annotations.tags.Tag;




@RestController
public class CarprojectController {

	@Autowired
	CarprojectService tutService;
	
	
	//http://localhost:8080/getTutor
	@Tag(name="Vasundhra",description="pro")
	@GetMapping(value="/getCar")
	public List<Carproject>getAllCar()
	{
		List<Carproject>tutList=tutService.getAllCar();
		return tutList;
	}
	
	//http://localhost:8080/saveCar
	@PostMapping(value="/saveCar")
	public Carproject saveCar(@RequestBody Carproject u)
	{
		return tutService.saveCar(u);
	}
	
	//http://localhost:8080/updateCar/1
	@PutMapping(value="updateCar/{id}")
	public Carproject updateCar(@RequestBody Carproject u,@PathVariable ("id") int id)
	{
		return tutService.updateCar(u,id);
	}
	
	//http://localhost:8080/deleteCar/6
	@DeleteMapping(value="deleteCar/{id}")
public void deleteCar(@PathVariable("id")int id)
	
	{
	    tutService.deleteCar(id);
	}
	
	
	@GetMapping(value="/getCar/{id}")
	public Carproject getCar(@PathVariable("id") int id)
	{
		return tutService.getCar(id);
	}
	
	//http://localhost:8080/sortCar/carmodel
	@GetMapping("/sortCar/{carmodel}")
	public List<Carproject> sortCar(@PathVariable String carmodel)
	{
		
		return tutService.sortCar(carmodel);
	}
	
	//http://localhost:8080/pageCar/0/3
	@GetMapping(value="/pageCar/{field}/{size}")
	public List<Carproject> pagingCar(@PathVariable("field") int offset,@PathVariable("size") int  pageSize)
	
	{
	 return tutService.pagingCar(offset, pageSize);	
	}
	
	
	//http://localhost:8080/pagination/1/3/carmodel
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Carproject> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String carmodel)
	{
		return tutService.paginate(num,size,carmodel);
	}
	
	//http://localhost:8080/fetchCarByFuelPrefix?prefix=p
	@GetMapping("/fetchCarByFuelPrefix")
	public List<Carproject> fetchCarByFuelPrefix(@RequestParam String prefix)
	{
		return tutService.fetchCarByFuelPrefix(prefix);
	}
	
	//http://localhost:8080/fetchByCarmodelsuffix?suffix=l
	@GetMapping("/fetchByCarmodelsuffix")
	public List<Carproject> fetchCarByFuelSuffix(@RequestParam String suffix)
	{
		return tutService.fetchCarByFuelSuffix(suffix);
	}
	
	//http://localhost:8080/findBySeating?seating=5
	@GetMapping("/findBySeating")
	public List<Carproject> findBySeating(@RequestParam String seating)
	{
		return tutService.findBySeating(seating);
	}
	
	//http://localhost:8080/fetchCarByMileage/16.8kmpl/Hyundai
	@GetMapping("/fetchCarByMileage/{mileage}/{carmodel}")
	public List<Carproject> fetchCarByMileage(@PathVariable 
			String mileage,@PathVariable String carmodel)
	{
		return tutService.fetchCarByMileage(mileage, carmodel);
	}
	
	//http://localhost:8080/getInstaByUsername?username=Vasundhra
	@GetMapping("/getCarByPrice")
	public List<Carproject>  getCarByPrice(@RequestParam String price)
	{
		return tutService.getCarByPrice(price);
	}
	
	
	//http://localhost:8080/deleteCarByid?id=6
	@DeleteMapping("/deleteCarByid")
	public String deleteCarById(int id)
	{
		int result=tutService.deleteCarById(id);
		if(result>0)
			
			return "Carproject record deleted";
		
		else
			
			return "Problem occured while deleting";
		
	}
	
	//http://localhost:8080/updateCarById/6/Hyundai
	@PutMapping("/updateCarById/{id}/{carmodel}")
    public int updateCarById(@PathVariable int id,@PathVariable String carmodel)
    {
 	   return tutService.updateCarById(id,carmodel);
    }
	
	
	
}




