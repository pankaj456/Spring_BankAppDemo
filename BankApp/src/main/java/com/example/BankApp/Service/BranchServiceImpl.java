package com.example.BankApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankApp.Model.Branch;
import com.example.BankApp.Repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService{
	
	@Autowired
	BranchRepository branchRepository;

	@Override
	public Branch getBranch(Integer id) {
		// TODO Auto-generated method stub
		return branchRepository.findBranchById(id);
	}

}
