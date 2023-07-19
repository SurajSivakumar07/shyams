package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.model.UsersModel;
import com.example.demo.service.UsersService;
 
@RestController
public class UserController {
	
	 @Autowired
	 
	 UsersService service;
	 
	 @PostMapping("/users")
	 
	 public String dataGet(@RequestBody UserDto user) {
		 return service.addData(user);
	 }
	 @GetMapping("/users")
	 public List<UsersModel> dataAdd(){
		 return service.getData();
	 }

}
