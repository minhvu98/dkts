package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.AccountDto;
import com.example.entity.Account;
import com.example.repository.AccountRepository;
import com.example.service.AccountService;

@Service
@Transactional(rollbackOn = Exception.class)
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public List<AccountDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDto findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(AccountDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AccountDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountDto> checklogin(String email, String password) {
		List<AccountDto> dto = new ArrayList<AccountDto>();
		List<Account> account = accountRepository.checklogin(email, password);
		for (Account account2 : account) {
			dto.add(new AccountDto(account2.getId(),account2.getEmail(),account2.getPassword()));
		}
		return dto;
	}

}
