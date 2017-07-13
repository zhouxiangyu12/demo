package com.example.demo2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.mapper.UserMapper;
import com.example.demo2.pojo.User;


@RestController
@RequestMapping("/web1")
public class UserController {
	 @Autowired
	    private UserMapper userMapper;
	    @RequestMapping("/user")
	    public List<User> getUser(){
	        return userMapper.getAll();
	    }
}
