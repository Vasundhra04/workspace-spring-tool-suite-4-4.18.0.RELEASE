package com.example.newproject.controller;

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

import com.example.newproject.model.Car;
import com.example.newproject.service.CarService;



@RestController
public class CarController {
     
	
	@Autowired
	CarService tutService;
	
	
	//http://localhost:8080/getTutor
	@GetMapping(value="/getTutor")
	public List<Car>getAllTutors()
	{
		List<Car>tutList=tutService.getAllTutors();
		return tutList;
	}
	
	//http://localhost:8080/saveTutor
	@PostMapping(value="/saveTutor")
	public Car saveTutors(@RequestBody Car u)
	{
		return tutService.saveTutors(u);
	}
	
	//http://localhost:8080/updateTutor/
	//@PutMapping(value="/updateTutor/{model}")
	//public Car updateTutors(@RequestBody Car u,@PathVariable ("model") String model)
	//{
		//return tutService.updateTutors(u,model);
	//}
	
	//http://localhost:8080/deleteTutor/
	@DeleteMapping(value="deleteTutor/{model}")
public void deleteTutors(@PathVariable("model")String model)
	
	{
	    tutService.deleteTutors(model);
	}
	
	
	@GetMapping(value="/getTutor/{model}")
	public Car getTutors(@PathVariable("model") String  model)
	{
		return tutService.getTutors(model);
	}
	
	//http://localhost:8080/sortStudents/emailid
	@GetMapping("/sortStudents/{field}")
	public List<Car> sortTutors(@PathVariable String field)
	{
		
		return tutService.sortTutors(field);
	}
	
	//http://localhost:8080/pageStudents/0/3
	@GetMapping(value="/pageStudents/{field}/{size}")
	public List<Car> pagingTutors(@PathVariable("field") int offset,@PathVariable("size") int  pageSize)
	
	{
	 return tutService.pagingTutors(offset, pageSize);	
	}
	
	
	//http://localhost:8080/pagination/1/3/emailid
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Car> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String model)
	{
		return tutService.paginate(num,size,model);
	}
	
	//http://localhost:8080/fetchStudentsbynameprefix?prefix=a
	@GetMapping("/fetchDetailsByModelPrefix")
	public List<Car> fetchDetailsByModelPrefix(@RequestParam String prefix)
	{
		return tutService.fetchDetailsByModelPrefix(prefix);
	}
	
	//http://localhost:8080/fetchStudentsbynamesuffix?suffix=a
	@GetMapping("/fetchDetailsByModelSuffix")
	public List<Car>fetchDetailsByModelSuffix(@RequestParam String suffix)
	{
		return tutService.fetchDetailsByModelSuffix(suffix);
	}
	
	//http://localhost:8080/findByBft?bft=Yes
	@GetMapping("/findByEngine")
	public List<Car> findByEngine(@RequestParam String engine)
	{
		return tutService.findByEngine(engine);
	}
	
	//http://localhost:8080/fetchInstaByEmailid/a@gamil.com/Vasundhra
	@GetMapping("/fetchInstaByEmailid/{model}/{engine}")
	public List<Car> fetchCarByModel(@PathVariable 
			String model,@PathVariable String engine)
	{
		return tutService.fetchCarByModel(model, engine);
	}
	
	//http://localhost:8080/getInstaByUsername?username=Vasundhra
	@GetMapping("/getCarByMileage")
	public List<Car>  getCarByMileage(@RequestParam String mileage)
	{
		return tutService.getCarByMileage(mileage);
	}
	
	
    //http://localhost:8080/deleteInstaByUsername?username=Subha
	@DeleteMapping("/deleteCarByPrice")
	public String deleteCarByPrice(String price)
	{
		int result=tutService.deleteCarByPrice(price);
		if(result>0)
			
			return "Insta record deleted";
		
		else
			
			return "Problem occured while deleting";
		
	}
	
	//http://localhost:8080/updateInstaByName/5432/Vinu
	@PutMapping("/updateCarByModel/{model}/{engine}")
    public Car updateCarByModel(@PathVariable String model,String engine)
    {
 	  
		return tutService.updateCarByModel(model,engine);
	
    }
}
