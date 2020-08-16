package com.example.service;

import java.util.List;

import com.example.dto.UserDto;

public interface UserService {
	List<UserDto> findAll();
	UserDto findById(int id);
	void add(UserDto dto);
	void update(UserDto dto);
	void delete(int id);
	public List<UserDto> search(String keyword);
}
