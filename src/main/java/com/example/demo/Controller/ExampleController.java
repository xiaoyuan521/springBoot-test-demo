package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.UserModel;
import com.example.demo.Service.UserService;

@Controller
public class ExampleController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/")
	public String theFirstPrj() {
		return "index";
	}

	@RequestMapping(value = "/login")
	@ResponseBody
	public List<UserModel> login(UserModel userModel) {

		List<UserModel> userList = userService.findAllUser();

		return userList;
	}

	@RequestMapping(value = "/regist")
	@ResponseBody
	public List<UserModel> regist() {

		String username = "aaa" + System.currentTimeMillis();
		String password = "ball" + System.currentTimeMillis();
		UserModel userModel = new UserModel();
		userModel.setUsername(username);
		userModel.setPassword(password);
		userService.insert(userModel);
		List<UserModel> userList = userService.findAllUser();

		return userList;
	}

	@RequestMapping(value = "/del")
	@ResponseBody
	public List<UserModel> delete() {

		List<UserModel> userList = userService.findAllUser();
		int id = 10;
		String username = "aaa" + System.currentTimeMillis();
		String password = "ball" + System.currentTimeMillis();
		userService.singleInsert(id, username, password);
		userService.delete(id);
		return userList;
	}

	@RequestMapping(value = "/update")
	@ResponseBody
	public List<UserModel> update() {

		List<UserModel> userList = userService.findAllUser();
		int id = 1;
		String username = "hhh" + System.currentTimeMillis();
		userService.update(id, username);
		return userList;
	}

}
