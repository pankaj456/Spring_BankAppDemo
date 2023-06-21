package com.example.BankApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankApp.Model.Branch;
import com.example.BankApp.Service.BranchServiceImpl;

@RestController
public class BranchController {

	@Autowired
    BranchServiceImpl branchService;

  
    @GetMapping(path = "/branches/{id}")
    public Branch getBranch(@PathVariable("id") Integer id) {
        return branchService.getBranch(id);
    }
}