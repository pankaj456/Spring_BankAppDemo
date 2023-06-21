package com.example.BankApp.Service;

import java.util.List;

import com.example.BankApp.Model.Account;

public interface AccountService {
	
	 public Account getAccount(String accountNumber);
	 
//	 public List<Account>  getAccountbyBranchid(int branch_id);
	 
	 public List<Account>  getAccountsByBranchCode(String branchcode);

}
