package com.example.BankApp.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BankApp.Model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Serializable> {

//    @Query("select a from Account a where a.accountNumber = ?1")
//    public Account findAccount(String accountNumber);
    
    @Query("select a from Account a join fetch a.branch b where b.branchCode = ?1")
    public List<Account> findAccountsByBranchCode(String branchCode);

    @Query("select a from Account a join fetch a.branch where a.accountNumber = ?1")
    public Account findAccount(String accountNumber);
    
    
//    @Query("select a from Account a join a.branch b where b.branch_id = ?1")
//    @Query("select * from Account branch_id = ?")
//    @Query("select a from Account a join fetch a.branch where a.branch_id = ?1")
//    public List<Account> findAccountsByBranchId(int branch_id);
    
    
//    @Query(value = "from AdminEntity where email=:eml AND Id=:id",nativeQuery = false)
//	public Optional<AdminEntity> findByEmailAndId(String eml, int id);

}