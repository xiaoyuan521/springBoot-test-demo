package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.UserModel;
import com.example.demo.Service.UserService;

@Controller
public class ExampleController{
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/")
	public String theFirstPrj() {
		return "index";
	}
	
	@RequestMapping(value = "/login")
	@ResponseBody
	public List<UserModel> login() {
		List<UserModel> userList = userService.findAllUser();
	
		return userList;
	}
	
}
