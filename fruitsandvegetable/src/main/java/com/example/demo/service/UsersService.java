package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.UserDto;
import com.example.demo.model.UsersModel;
 

 
public interface UsersService {
	
	public String addData(UserDto model);
	
	public List<UsersModel> getData();
}
