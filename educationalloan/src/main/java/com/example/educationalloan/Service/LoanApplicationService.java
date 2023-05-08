package com.example.educationalloan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educationalloan.Model.LoanApplicationModel;
import com.example.educationalloan.Repository.LoanApplicationModelRepository;

@Service
public class LoanApplicationService {

	@Autowired
	LoanApplicationModelRepository laRep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}
	
	public LoanApplicationModel saveLoans(LoanApplicationModel l)
	{
		return laRep.save(l);
	}

	public LoanApplicationModel changeLoans(LoanApplicationModel c)
	{
		return laRep.saveAndFlush(c);
	}
	public void deleteLoan(int loanid)
		{
		laRep.deleteById(loanid);
		}

}
