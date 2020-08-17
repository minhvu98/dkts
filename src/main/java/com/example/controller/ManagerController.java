package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(@RequestParam("id") int id, ModelMap model) {

		model.addAttribute("user", userService.findById(id));
		return "manager/edit";
	}
	
	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(ModelMap model, @ModelAttribute("user") UserDto user,
			BindingResult errors) {
		// KIỂM TRA NHẬP LIỆU
		if(errors.hasErrors()) {
			return "manager/edit";
		}
		
		try {
			System.out.println(user.getId());
			userService.update(user);
			return "redirect:/manager";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("message", "Cập nhật thất bại!");
		return "manager/edit";
	}
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id) {
		userService.delete(id);
		return "redirect:/manager";
	}
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String search(@RequestParam("keyword") String keyword, ModelMap model) {
		// Gọi phương thức tìm kiếm của tầng repository
		List<UserDto> list = userService.search(keyword);
		model.addAttribute("user", list);
		return "manager/index";
	}
}
