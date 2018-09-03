package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.Model.UserModel;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public List<UserModel> findAllUser() {
		return userMapper.selectAllUser();
	}

}
