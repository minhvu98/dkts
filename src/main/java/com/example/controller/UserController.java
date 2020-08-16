package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.UserService;

@Controller
@RequestMapping("/dk")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		return "dangky/index";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(ModelMap model) {
		model.addAttribute("user", new User());
		return "dangky/index";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String post(ModelMap model, @Validated @ModelAttribute("user") UserDto user, BindingResult errors) {
		try {
			userService.add(user);
			return "redirect:/dk/add2";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("message", "Them moi that bai");
		return "dk/add";
	}
	
	
}