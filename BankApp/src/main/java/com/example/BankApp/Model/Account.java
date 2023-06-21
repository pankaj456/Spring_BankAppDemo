package com.example.BankApp.Model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@Table(name = "account")
@EntityListeners(AuditingEntityListener.class)
public class Account implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String accountNumber;
    String fullName;
    BigDecimal balance;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "branchId")
    Branch branch;

}
