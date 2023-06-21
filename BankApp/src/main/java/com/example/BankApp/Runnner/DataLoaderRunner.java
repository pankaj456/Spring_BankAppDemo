package com.example.BankApp.Runnner;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.BankApp.Model.Account;
import com.example.BankApp.Model.Branch;
import com.example.BankApp.Repository.AccountRepository;
import com.example.BankApp.Repository.BranchRepository;

@Component
public class DataLoaderRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(DataLoaderRunner.class);
	
	@Autowired
	BranchRepository branchRepository;
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
		Account a1 = new Account();
		a1.setAccountNumber("1231231241");
		
		a1.setFullName("Pankaj Kumar");
		BigDecimal a = new BigDecimal("1000.03");
		a1.setBalance(a);
		
		Account a2 = new Account();
		a2.setAccountNumber("1231231242");
		
		a2.setFullName("anish gupta");
		BigDecimal b = new BigDecimal("2000.03");
		a2.setBalance(b);
		
		Account a3 = new Account();
		a3.setAccountNumber("1231231243");

		a3.setFullName("ashish sharma");
		BigDecimal c = new BigDecimal("3000.03");
		a3.setBalance(c);
		
		Branch  br1 = new Branch();
		br1.setBranchCode("121");
		br1.setBranchName("South Tukoganj");
		
		Branch  br2 = new Branch();
		br2.setBranchCode("122");
		br2.setBranchName("Annapurna");
		
		
//		branchRepository.save(br1);
//		branchRepository.save(br2);
		
		a1.setBranch(br1);
		a2.setBranch(br2);
		a3.setBranch(br1);
	
		
//		accountRepository.save(a1);
//		accountRepository.save(a2);
//		accountRepository.save(a3);
		
	
		
		
	}


}
