package com.example.BankApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankApp.Model.Account;
import com.example.BankApp.Service.AccountServiceImpl;

@RestController
public class AccountController {
	
	

	
	@Autowired
    private AccountServiceImpl accountService;

  
    @GetMapping(path = "/accounts/{accountNumber}")
    public Account getAccount(@PathVariable("accountNumber") String accountNumber) {
        return accountService.getAccount(accountNumber);
    }
    
//    @GetMapping(path = "/accountsbybranchid/{branchId}")
//    public List<Account> getAccountbyBranchid(@PathVariable("branch_id") int branch_id) {
//    	
//    	System.out.println("getAccountbyBranchid "+ branch_id );
//        return accountService.getAccountbyBranchid(branch_id);
//    }
    
    
    @GetMapping(path = "/accounts1/{branch_code}")
    public List<Account> getAccountbyBranchCode(@PathVariable("branch_code") String branch_code) {
    	
    	System.out.println("getAccountbyBranchid "+ branch_code );
        return accountService.getAccountsByBranchCode(branch_code);
    }
}