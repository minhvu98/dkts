package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dto.UserDto;
import com.example.service.UserService;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(ModelMap model) {
		// LẤY DANH SÁCH ROLE TỪ DATABASE
		List<UserDto> list = userService.findAll();
		// CHUYỂN TIẾP DS ROLE QUA CHO THYMELEAF (index.html)
		model.addAttribute("user", list);
		return "manager/index";
	}
}
