package com.example.Carproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Carproject.Model.Userlogin;
import com.example.Carproject.Repository.UserloginRepository;


@Service
public class UserloginService {

	@Autowired
	UserloginRepository lrep;
	
	public Userlogin saveUser(Userlogin l)
	{
		return lrep.save(l);
	}
	
	
	
	public String validateUser(String username,String password)
	{
		String result="";
		Userlogin l=lrep.findByUsername(username);
		if(l==null)
		{
			result="Invalid user";
		}
			else
			{
				if(l.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
		

		return result;
		}
}
