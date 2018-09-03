package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.UserModel;

@Mapper
public interface UserMapper {
	public List<UserModel> selectAllUser();
}
