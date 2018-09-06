package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.UserModel;

@Mapper
public interface UserMapper {
	public List<UserModel> selectAllUser();
	
	public void insert(UserModel userModel);
	
	public void singleInsert(int id,String username,String password);
	
	public void delete(int id);
	
	public void update(int id,String username);
	
}
