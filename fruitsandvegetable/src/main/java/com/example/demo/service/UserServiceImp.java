package com.example.demo.service;
 
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CartDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.CartModel;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.UsersRepository;

@Service
public class UserServiceImp implements UsersService{
	@Autowired
	UsersRepository repo;
	
	@Autowired 
	CartRepository cartRepo;
	
	public String addData(UserDto user) {
		
		UsersModel model=new UsersModel();
		
		CartModel cartModel=new CartModel();
		
		BeanUtils.copyProperties(user, model);
		BeanUtils.copyProperties(user, cartModel);
		
		repo.save(model);
		
		cartRepo.save(cartModel);
		
		
		return "Added";
	}
	
	
	public List<UsersModel> getData(){
		return repo.findAll();
	}
	
	
}
