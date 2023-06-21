package com.example.BankApp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankApp.Model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Serializable> {

	Branch findBranchById(Integer id);

}