package com.example.demo2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {

	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	
	public String getName()
	{
		String studentName="Vasundhra";
		return "Welcome "+studentName+"!" ;
	}
	
	
}
