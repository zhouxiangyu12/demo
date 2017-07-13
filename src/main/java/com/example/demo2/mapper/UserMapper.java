package com.example.demo2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo2.pojo.User;

@Mapper
public interface UserMapper {
	@Select("select * from user")
    List<User> getAll();
}
