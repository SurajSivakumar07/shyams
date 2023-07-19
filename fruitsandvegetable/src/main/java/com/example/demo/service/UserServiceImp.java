package com.example.demo.service;
 
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsersRepository;

@Service
public class UserServiceImp implements UsersService{
	@Autowired
	UsersRepository repo;
	
	public String addData(UserDto user) {
		
		UsersModel model=new UsersModel();
		
		BeanUtils.copyProperties(user, model);
		
		
		repo.save(model);
		
		return "Added";
	}
	
	
	public List<UsersModel> getData(){
		return repo.findAll();
	}
}
