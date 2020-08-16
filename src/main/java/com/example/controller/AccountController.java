package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dto.AccountDto;
import com.example.service.AccountService;

@Controller
@RequestMapping("/login")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		return "login/login";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String post(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap model) {
		List<AccountDto> list = accountService.checklogin(email, password);
		return "dk/add";
	}
}
