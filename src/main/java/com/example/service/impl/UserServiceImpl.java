package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	

	public List<UserDto> findAll() {
		List<UserDto> dto = new ArrayList<UserDto>();
		List<User> user = userRepository.findAll();
		
		for (User user2 : user) {
			dto.add(new UserDto(user2.getId(),user2.getFullname(),user2.getEmail(),user2.getSex(),user2.getBirthday(),user2.getIdentification(),user2.getMath_mark(),user2.getEnglish_mark(),user2.getLiterature_mark(),user2.getTotal_mark(),user2.getSix_academic(),user2.getSix_conduct(),user2.getSevent_academic(),user2.getSevent_conduct(),user2.getEight_academic(),user2.getEight_conduct(),user2.getNine_academic(),user2.getNine_conduct()));
		}
		
		return dto;
	}


	public UserDto findById(int id) {
		User user = userRepository.findById(id).get();
		return new UserDto(user.getId(),user.getFullname(),user.getEmail(),
				user.getSex(),user.getBirthday(),user.getIdentification(),
				user.getMath_mark(),user.getEnglish_mark(),user.getLiterature_mark(),
				user.getTotal_mark(),user.getSix_academic(),user.getSix_conduct(),
				user.getSevent_academic(),user.getSevent_conduct(),
				user.getEight_academic(),user.getEight_conduct(),
				user.getNine_academic(),user.getNine_conduct());
	}


	public void add(UserDto dto) {
		//User user = new User(dto.getId(), dto.getFullname(), dto.getEmail(), dto.getSex(), dto.getBirthday(), dto.getIdentification(), dto.getMath_mark(), dto.getEnglish_mark(), dto.getLiterature_mark(), dto.getTotal_mark(), dto.getConduct_id(), dto.getAcademic_id(), dto.get);
		User user = new User();
		user.setId(dto.getId());
		user.setFullname(dto.getFullname());
		user.setEmail(dto.getEmail());
		user.setSex(dto.getSex());
		user.setBirthday(dto.getBirthday());
		user.setIdentification(dto.getIdentification());
		user.setMath_mark(dto.getMath_mark());
		user.setEnglish_mark(dto.getEnglish_mark());
		user.setLiterature_mark(dto.getLiterature_mark());
		user.setTotal_mark(dto.getTotal_mark());
		user.setSix_academic(dto.getSix_academic());
		user.setSix_conduct(dto.getSix_conduct());
		user.setSevent_academic(dto.getSevent_academic());
		user.setSevent_conduct(dto.getSevent_conduct());
		user.setEight_academic(dto.getEight_academic());
		user.setEight_conduct(dto.getEight_conduct());
		user.setNine_academic(dto.getNine_academic());
		user.setNine_conduct(dto.getNine_conduct());
		userRepository.save(user);
	}


	public void update(UserDto dto) {
		User user = userRepository.findById(dto.getId()).get();
		user.setFullname(dto.getFullname());
		user.setEmail(dto.getEmail());
		user.setSex(dto.getSex());
		user.setBirthday(dto.getBirthday());
		user.setIdentification(dto.getIdentification());
		user.setMath_mark(dto.getMath_mark());
		user.setEnglish_mark(dto.getEnglish_mark());
		user.setLiterature_mark(dto.getLiterature_mark());
		user.setTotal_mark(dto.getTotal_mark());
		user.setSix_academic(dto.getSix_academic());
		user.setSix_conduct(dto.getSix_conduct());
		user.setSevent_academic(dto.getSevent_academic());
		user.setSevent_conduct(dto.getSevent_conduct());
		user.setEight_academic(dto.getEight_academic());
		user.setEight_conduct(dto.getEight_conduct());
		user.setNine_academic(dto.getNine_academic());
		user.setNine_conduct(dto.getNine_conduct());
		userRepository.save(user);
	}
	
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<UserDto> search(String keyword) {
		List<UserDto> dtos = new ArrayList<UserDto>();
		List<User> users = userRepository.search(keyword);
		for (User user : users) {
			dtos.add(new UserDto(user.getId(),user.getFullname(),user.getEmail(),
					user.getSex(),user.getBirthday(),user.getIdentification(),
					user.getMath_mark(),user.getEnglish_mark(),user.getLiterature_mark(),
					user.getTotal_mark(),user.getSix_academic(),user.getSix_conduct(),
					user.getSevent_academic(),user.getSevent_conduct(),
					user.getEight_academic(),user.getEight_conduct(),
					user.getNine_academic(),user.getNine_conduct()));
		}
		return dtos;
	}
	
}
