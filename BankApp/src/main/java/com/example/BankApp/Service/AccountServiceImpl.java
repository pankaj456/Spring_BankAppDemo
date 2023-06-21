package com.example.BankApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankApp.Model.Account;
import com.example.BankApp.Repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	
	@Autowired
    AccountRepository accountRepository;

	@Override
    public Account getAccount(String accountNumber){
        return  accountRepository.findAccount(accountNumber);
    }
    
//    @Override
//    public List<Account> getAccountbyBranchid(int branch_id){
//        return  accountRepository.findAccountsByBranchId(branch_id);
//    }



	@Override
	public List<Account> getAccountsByBranchCode(String branchcode) {
		// TODO Auto-generated method stub
		return accountRepository.findAccountsByBranchCode(branchcode);
	}

}