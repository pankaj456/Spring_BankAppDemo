package com.example.BankApp.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "branch")
@EntityListeners(AuditingEntityListener.class)
public class Branch implements Serializable{
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer id;
	 
	 String branchCode;
	 
	 String branchName;
	 
//	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
//	 private List<Account> accounts;
	 
	 @JsonIgnore
	 @OneToMany(mappedBy = "branch")
	 List<Account> accounts;

}
