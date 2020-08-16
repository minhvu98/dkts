package com.example.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	@Query("SELECT a.email, a.password FROM Account a WHERE name = :email and password = :password")
	public List<Account> checklogin(@Param("email") String email, String password);
}
