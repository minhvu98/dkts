package com.example.service;

import java.util.List;

import com.example.dto.AccountDto;

public interface AccountService {
	List<AccountDto> findAll();
	AccountDto findById(int id);
	void add(AccountDto dto);
	void update(AccountDto dto);
	void delete(int id);
	public List<AccountDto> checklogin(String email, String password);
}
