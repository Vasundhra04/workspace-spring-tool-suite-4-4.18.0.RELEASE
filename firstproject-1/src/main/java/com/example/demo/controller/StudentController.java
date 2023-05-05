package com.example.demo.controller;

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

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@RestController

public class StudentController {
	
	@Autowired
	StudentService studService;
	
	@GetMapping(value="/fetchStudents")
	public List<Student>getAllStudents()
	{
		List<Student>studList=studService.getAllStudents();
				return studList;
	}
	@PostMapping(value="/saveStudents")
	public Student  saveStudents(@RequestBody Student u)
	{
		return studService.saveStudents(u);
	}
	@PutMapping(value="/updateStudents/{regno}")
	public Student updateStudents(@RequestBody Student u,@PathVariable ("regno") int regno)
	{
		return studService.saveStudents(u);
	}
	@DeleteMapping(value="deleteStudents/{regno}")
	public void deleteStudents(@PathVariable("regno") int regno)
	{
		studService.deleteStudents(regno);
	}
	@GetMapping(value="/getStudents")
	public Student getStudents(@PathVariable("regno") int regno)
	{
		return studService.getStudents(regno);
	}
	@GetMapping("/sortStudents/{field}")
	public List<Student>sortStudents(@PathVariable String field)
	{
		return studService.sortStudents(field);
	}
	@GetMapping(value="/pageStudents/{field}/{size}")
	public List<Student>pagingStudents(@PathVariable("field") int offset,@PathVariable("size") int  pageSize)
	
	{
	 return studService.pagingStudents(offset, pageSize);	
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Student> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return studService.paginate(num,size,name);
	}
	//http://localhost:9080/fetchStudentsByNamePrefix?prefix=a
	@GetMapping("/fetchStudentsbynameprefix")
	public List<Student> fetchStudentsByNamePrefix(@RequestParam String prefix)
	{
		return studService.fetchStudentsByNamePrefix(prefix);
	}
	@GetMapping("/fetchStudentsbynamesuffix")
	public List<Student> fetchStudentsByNameSuffix(@RequestParam String suffix)
	{
		return studService.fetchStudentsByNameSuffix(suffix);
	}
	@GetMapping("/fetchStudentsbyDept")
	public List<Student> findByDepartment(@RequestParam String dept)
	{
		return studService.findByDept(dept);
	}
	
	//http://localhost:8080/fetchStudentsByDepartment/ECE/Minu
	@GetMapping("/fetchStudentsByDept/{dept}/{name}")
	public List<Student> fetchStudentsByDept(@PathVariable 
			String dept,@PathVariable String name)
	{
		return studService.getStudentsByDept(dept, name);
	}
     
	//http://localhost:8080/fetchStudentByDept?dept=cse
	@GetMapping("fetchStudentByDept")
	public List<Student>getStudentsByDept(@RequestParam String dept)
	{
		return studService.getStudentsByDept(dept);
	}
	
	//http://localhost:8080/deleteStudentByName/Subha
	@DeleteMapping("/deleteStudentByName/{name}")
	public String deleteStudentByName(String name)
	{
		int result=studService.deleteStudentByName(name);
		if(result>0)
			
			return "Student record deleted";
		
		else
			
			return "Problem occured while deleting";
		
	}
	
	
	

	
}

