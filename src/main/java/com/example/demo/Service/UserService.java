package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.UserModel;

public interface UserService {

	List<UserModel> findAllUser();
	
	List<UserModel> findUserByUserAndPwd(String username,String password);

	void insert(UserModel userModel);
	
	void singleInsert(int id ,String username,String password);

	void delete(int id);
	
	void update(int id,String username);

}
