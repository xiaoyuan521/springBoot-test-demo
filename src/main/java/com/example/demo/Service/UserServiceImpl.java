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

	@Override
	public void insert(UserModel userModel) {
		userMapper.insert(userModel);
		
	}

	@Override
	public void delete(int id) {
		userMapper.delete(id);
	}

	@Override
	public void singleInsert(int id ,String name,String hobby) {
		userMapper.singleInsert(id ,name ,hobby);
		
	}

	@Override
	public void update(int id, String name) {
		userMapper.update(id, name);
		
	}

}
